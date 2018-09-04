package com.itheima.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {
	
	
	@RequestMapping("/hello")
	@ResponseBody
	public Map<String,Object> fun1() {
		Map<String,Object> map = new HashMap();
		map.put("msg", "helloworld");
		
		System.prinlt.out("你好函数及活动时间黑胡椒...");
		System.prinlt.out("你好函数及活动时间黑胡椒...");
		System.prinlt.out("你好函数及活动时间黑胡椒...");
		System.prinlt.out("你好函数及活动时间黑胡椒...");
		System.prinlt.out("你好函数及活动时间黑胡椒...");
		System.prinlt.out("你好函数及活动时间黑胡椒...");
		
		return map;
	}
	
}
