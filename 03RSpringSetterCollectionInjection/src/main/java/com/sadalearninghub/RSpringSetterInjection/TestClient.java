package com.sadalearninghub.RSpringSetterInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestClient {

	public static void main(String[] args) {
		//1. java.util.List --> <list>
		//2. java.util.Set --> <set>
		//3. java.util.Map --> <map>
		//4. java.util.properties --> <props>
		
		Resource r = new ClassPathResource("bean.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		SetBean s = (SetBean) factory.getBean("id2");
		//1 .container creates an object of SetBean class
		//SetBean s = new SetBean()
		//2. container create HashSet
		//Set set = new HashSet();
		//3. container sets the values to set collection
		//set.add("RajeshSet")
		//set.add("sadaSet");
		//set.add("XYZSet");
		//4. Container will inject the set using setter injection
		//s.setMySet(set)
		s.show();
		s.disMySet();
		
		System.out.println("======================");
		
		ListBean l = (ListBean) factory.getBean("id1");
		l.display();
		l.showListStudents();
		
		System.out.println("======================");
		
		MapBean m = (MapBean) factory.getBean("id3");
		m.show();
		
		System.out.println("======================");
		
		PropertiesBean p = (PropertiesBean) factory.getBean("id4");
		p.disp();
		
		

	}

}
