package com.cg.springiocdemo.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.cg.springiocdemo.component.Greeting;

public class TestClass {

	public static void main(String[] args) {
//		Greeting greeting=new Greeting();
//		greeting.sayHello();
		
		//Create Factory
		Resource resource =  new FileSystemResource("bean.xml");
		BeanFactory beanFactory =  new XmlBeanFactory(resource);
		Greeting greeting = (Greeting)beanFactory.getBean("greeting");
		greeting.sayHello();

	}

}
