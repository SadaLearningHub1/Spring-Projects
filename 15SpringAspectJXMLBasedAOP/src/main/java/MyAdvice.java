import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {
	public void before(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		Object args[] = jp.getArgs();
		System.out.println("I am before advice to : "+methodName);
		System.out.println("It's argument values are  : "+args[0]+ " , "+args[1]);
	}
	public void afterReturning(JoinPoint jp, Object result) {
		String methodName=jp.getSignature().getName();
		Object args[] = jp.getArgs();
		System.out.println("It's after returning advice to :"+methodName);
		System.out.println("the result of this method : "+result);
	}
	public void afterThrowing(JoinPoint jp, Throwable t) {
		System.out.println("I am after throwing advoice");
	}
	public void after(JoinPoint jp) {
		System.out.println("I am from after advice");
	}
	public Object around(ProceedingJoinPoint pjp) {
		System.out.println("I am from Around advice");
		return pjp;
	}

}
