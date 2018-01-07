package study.java.annotation.userDefined.test1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
//  Runtime�� �ش� interface�� �߻� �޼ҵ尡 ������ ���Ŀ��� JVM�� ���ؼ� ���� ����
@Target(value = ElementType.METHOD)// �ش� 
public @interface UserName { // defined annotation PSA
	// @ : �Ϲ����� interface�� annotation PSA�� �����ϱ� ���� ������
	// ���������� @interface�� Interface Annotation(){ .. }�� ���

	public String getName();
}
