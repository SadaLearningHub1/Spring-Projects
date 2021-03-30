import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestClient {
	public static void main(String args[]) {
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Object o = factory.getBean("eb1");
		ExampleBean1 eb = (ExampleBean1)o;
		eb.show1();
		eb.show2();
	}

}
