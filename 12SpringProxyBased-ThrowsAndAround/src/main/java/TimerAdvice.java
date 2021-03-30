import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class TimerAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		String str1 = arg0.getMethod().getName();
		System.out.println("I am around advice to : "+str1);
		long x = System.currentTimeMillis();
		Object o = arg0.proceed();
		long y = System.currentTimeMillis();
		long z = y-x;
		System.out.println("Time taken for business in milliseconds: "+z);
		return o;
	}

}
