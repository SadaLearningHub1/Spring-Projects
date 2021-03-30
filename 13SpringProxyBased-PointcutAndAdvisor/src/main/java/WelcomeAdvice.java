import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class WelcomeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		String methodName = arg0.getName();
		System.out.println("I am before Advice");
		System.out.println("Welcome to :"+methodName);
		
	}
	

}
