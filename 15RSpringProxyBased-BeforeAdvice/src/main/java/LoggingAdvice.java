import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LoggingAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("I am logging advice before business logic");
		
	}

}
