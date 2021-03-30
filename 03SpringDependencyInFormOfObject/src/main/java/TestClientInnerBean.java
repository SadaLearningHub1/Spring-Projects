import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestClientInnerBean {
	public static void main(String args[]) {
		Resource resource = new ClassPathResource("innerbean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Object o = factory.getBean("id1");
		Service s = (Service)o;
		s.showReport();
	}

}
