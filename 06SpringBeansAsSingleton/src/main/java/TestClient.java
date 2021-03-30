import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestClient {
	public static void main(String args[]) {
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Object o1 = factory.getBean("oo");
		OnlyOne oo1 = (OnlyOne)o1;
		Object o2 = factory.getBean("oo");
		OnlyOne oo2 = (OnlyOne)o2;
		System.out.println("oo1 hashcode="+oo1.hashCode());
		System.out.println("oo2 hashcode="+oo2.hashCode());
	}

}
