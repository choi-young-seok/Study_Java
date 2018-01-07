package study.java.annotation.userDefined.test2;

import javax.print.DocFlavor.STRING;

public class RequestParamTestController {

	public static String callAnnotation(@RequestParamDefined String name){
		System.out.println(name);
		return name;
	}

	public static void main(String[] args) throws IllegalAccessException, InstantiationException {
		SpringContainerDefined containerDefined = new SpringContainerDefined();
//		TestVO testVO = new TestVO();
		String name = containerDefined.get(String.class);
		
		callAnnotation("");

	}

}
