import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionAdvice implements ThrowsAdvice {
	public void afterThrowing(Method m, Object args[], Object target, Exception e) {
		String str = m.getName();
		System.out.println("I am Throws Advice for : "+str);
		System.out.println("The exception Occured in the business method is: "+e.getMessage());
	}

}
