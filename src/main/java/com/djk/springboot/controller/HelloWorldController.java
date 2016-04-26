package com.djk.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.djk.springboot.service.DubboService;

@Controller
public class HelloWorldController {

	@Autowired
	private DubboService dubboService;
	

	@RequestMapping( value = "/dubbo", method = RequestMethod.GET)
	@ResponseBody
	public String sayWorld(String name) {
		System.out.println("远程调用成功");
		System.out.println(dubboService.hello(name));
		return "Hello " + name;
	}

}
