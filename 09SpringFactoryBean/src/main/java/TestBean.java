import org.springframework.beans.factory.FactoryBean;

public class TestBean implements FactoryBean<Object>{

	@Override
	public Object getObject() throws Exception {
		// TODO Auto-generated method stub
		B b = new B();
		return b;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		Class c = B.class;
		return c;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}
	

}
