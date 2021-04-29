import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

public class MyDynamicPointcut extends DynamicMethodMatcherPointcut{

	@Override
	public boolean matches(Method method, Class<?> targetClass, Object[] args) {
		boolean flag = false;
		int k =(Integer)args[0];
		if(targetClass == FactorialImpl.class) {
			if(method.getName().startsWith("f") && k > 0) {
				flag = true;
			}
		}
		return flag;
	}

}
