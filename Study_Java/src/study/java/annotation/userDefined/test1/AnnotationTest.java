package study.java.annotation.userDefined.test1;

import java.lang.reflect.Method;

public class AnnotationTest {

	// annotation with public method
	@UserName(getName = "choi-hong-hye")
	public String getUserName(String name) {
		return name;
	}

	// annotation with public method in parameter
	// public String getUserName2(@UserName(name="default value") String name){
	// 	System.out.println("anotation call test : " + name);
	// 	return name;
	// }

	public static void main(String[] args) {
		AnnotationTest annotationTest = new AnnotationTest();

		try {

			Method method = annotationTest.getClass().getDeclaredMethod("getUserName", String.class);
			//Java Reflextion을 이용한 
			UserName userName = (UserName) method.getAnnotation(UserName.class);
			
			//annotation print test in first case : method range
			System.out.println(annotationTest.getUserName(userName.getName()));
			
			//annotation print test in second case : parameter range
			// System.out.println(annotationTest.getUserName2("hong"));
			// annotationTest.getUserName("");

		} catch (Exception e) {

			e.printStackTrace();

		} // try ~ catch

		// @RequestMappig(value = "/annotation_test)

	}

}
