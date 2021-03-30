import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@After("execution(* Demo.businessMethod1(..))")
	public void after(JoinPoint jp) {
		String str = jp.getSignature().getName();
		System.out.println("I am after advice : "+str);
	}
	
	@Around("execution(* Demo.businessMethod2(..))")
	public void around(ProceedingJoinPoint pjp) {
		try {
			long x = System.currentTimeMillis();
			pjp.proceed();
			long y=System.currentTimeMillis();
			String str=pjp.getSignature().getName();
			System.out.println("I am around Advice to : "+str);
			System.out.println("Time taken to run the business is : "+(x-y));
			
		}catch (Throwable e) {
		}
	}
	
	@Before("execution(* Demo.before(..))")
	public void before(JoinPoint jp) {
		System.out.println("Before aspect from aspect class");
	}
	
	@AfterReturning(pointcut="execution(* Demo.afterReturning(..))", returning="result")
	public void afterReturning(JoinPoint jp, Object result) {
		System.out.println("After returning Aspect from aspect class");
	}
	

}
