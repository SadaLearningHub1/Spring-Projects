import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestClient {
	public static void main(String args[]) {
		/*Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);*/
		
		Resource parentResource = new ClassPathResource("parentBeans.xml");
		BeanFactory factoryParent = new XmlBeanFactory(parentResource);
		
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource, factoryParent);
		
		Object o = factory.getBean("id3");
		Service s = (Service)o;
		s.showReport();
		
		Object o1 = factory.getBean("id4");
		Service s1 = (Service)o1;
		s1.showReport();
	}

}
