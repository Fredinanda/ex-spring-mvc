package com.sds.icto.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user/*")
public class UserController3 {
	
	
	@RequestMapping("/add3")
	@ResponseBody
	public String add3(){
		return "add3()";
	}



}
