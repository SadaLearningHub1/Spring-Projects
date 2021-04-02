package com.sadalearninghub.RSpringSetterInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestClient {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("bean.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		DemoBean demoBean = (DemoBean) factory.getBean("id1");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		DemoBean bean = (DemoBean) context.getBean("id1");
		bean.show();
		
	}

}
