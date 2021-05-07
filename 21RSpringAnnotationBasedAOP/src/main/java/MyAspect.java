import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
	
	@After("execution(* Demo.businessMethod1(..))")
	public void after(JoinPoint jp) {
		String str = jp.getSignature().getName();
		System.out.println("I am from after advice: "+str);
	}
	
	@Around("execution(* Demo.businessMethod2(..))")
	public void around(ProceedingJoinPoint pjp) {
		try {
			System.out.println("Aroung before");
			long x = System.currentTimeMillis();
			pjp.proceed();
			long y = System.currentTimeMillis();
			String str = pjp.getSignature().getName();
			System.out.println("I am from around advice: "+str);
			System.err.println("Time taken to run the business method: "+(x-y));
		}catch (Throwable e) {
			// TODO: handle exception
		}
	}

}
