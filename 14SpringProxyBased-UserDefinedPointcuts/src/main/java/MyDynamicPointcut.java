import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

public class MyDynamicPointcut extends DynamicMethodMatcherPointcut{

	@Override
	public boolean matches(Method arg0, Class<?> arg1, Object[] arg2) {
		boolean flag=false;
		int k=(Integer)arg2[0];
		if(arg1 == FactorialImpl.class) {
			if(arg0.getName().startsWith("f") && k>0) {
				flag=true;
			}
		}
		return flag;
	}

}
