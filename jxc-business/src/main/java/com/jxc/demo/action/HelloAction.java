package com.jxc.demo.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jxc.demo.bean.DemoInfo;
import com.jxc.demo.service.DemoService;

@Controller
@RequestMapping("/demo")
public class HelloAction {

	@Autowired
	private DemoService service;
	
	@RequestMapping("/hello")
	public String sayHello(@RequestParam("id") int id, ModelMap model) {
		DemoInfo info = service.get(id);
		model.addAttribute("hello", info.getName());
		return "helloworld";
	}
	
}
