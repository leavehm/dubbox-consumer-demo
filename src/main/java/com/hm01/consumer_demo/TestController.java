package com.hm01.consumer_demo;

import org.springframework.beans.factory.annotation.Autowired;
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
}
