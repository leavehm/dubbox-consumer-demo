package com.hm01.consumer_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.dubbox.provider_demo.service.HelloService;


@Controller
@RequestMapping("/t")
public class TestController {


	@Autowired
	HelloService helloServiceConsumer;

	@RequestMapping("/s.do")
	public void say(){
		helloServiceConsumer.sayHello();
		System.out.println("11111");
	}
	
	
	public static void main(String[] args){
		DefaultListableBeanFactory beanFacory=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(beanFacory);
        reader.loadBeanDefinitions(new ClassPathResource("applicationContext-base.xml"));
	}
}
