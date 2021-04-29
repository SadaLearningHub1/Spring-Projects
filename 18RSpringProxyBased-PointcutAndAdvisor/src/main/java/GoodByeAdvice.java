import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class GoodByeAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		String methodName = method.getName();
		System.out.println("I am from After returning advice");
		System.out.println("Good Bye from : "+methodName);
		
	}

}
