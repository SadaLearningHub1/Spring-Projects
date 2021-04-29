import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class TimerAdvice  implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String str = invocation.getMethod().getName();
		System.out.println("i am around advice to : "+str);
		long x = System.currentTimeMillis();
		Object o = invocation.proceed();
		long y = System.currentTimeMillis();
		long z = y-x;
		System.out.println("Time taken for business in milli secoonds : "+z);
		return o;
	}
	

}
