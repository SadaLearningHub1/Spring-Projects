import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class GoodByeAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		String methodName = arg1.getName();
		System.out.println("I am from After returning Advice");
		System.out.println("Good Bye from : "+methodName);
		
	}

}
