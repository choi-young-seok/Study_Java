package study.java.annotation.userDefined.test2;

import java.lang.reflect.Field;

public class SpringContainerDefined {
	
	public SpringContainerDefined() {
		// TODO Auto-generated constructor stub
	}

	 private <T> T invokeAnnonations(T instance) throws IllegalAccessException {
	        Field [] fields = instance.getClass().getDeclaredFields();
	        for( Field field : fields ){
	        	RequestParamDefined annotation = field.getAnnotation(RequestParamDefined.class);
	            if( annotation != null && field.getType() == String.class ){
	                field.setAccessible(true);
	                field.set(instance, annotation.value());
	            }
	        }
	        return instance;
	    }
	 
	 public <T> T get(Class clazz) throws IllegalAccessException, InstantiationException {
	        T instance = (T) clazz.newInstance();
	        instance = invokeAnnonations(instance);
	        return instance;
	    }
}
