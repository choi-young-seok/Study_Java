package study.java.annotation.userDefined.test1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
//  Runtime시 해당 interface의 추상 메소드가 컴파일 이후에도 JVM에 의해서 참조 가능
@Target(value = ElementType.METHOD)// 해당 
public @interface UserName { // defined annotation PSA
	// @ : 일반적인 interface와 annotation PSA를 구분하기 위한 구분자
	// 내부적으로 @interface는 Interface Annotation(){ .. }을 상속

	public String getName();
}
