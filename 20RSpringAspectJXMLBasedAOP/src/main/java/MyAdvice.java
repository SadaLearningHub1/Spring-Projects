import org.aspectj.lang.JoinPoint;

public class MyAdvice {
	
	public void before(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		Object args[] = jp.getArgs();
		System.out.println("I am from Before Advice: "+methodName);
		System.out.println("It's arguments values are: "+args[0] +", "+args[1]);
	}
	public void afterReturning(JoinPoint jp, Object result) {
		String methodName = jp.getSignature().getName();
		Object args[] = jp.getArgs();
		System.out.println("I am from AfterRetruning Advice: "+methodName);
		System.out.println("It's arguments values are: "+args[0] +", "+args[1]);
		System.out.println("The result of this method: "+result);
	}

}
