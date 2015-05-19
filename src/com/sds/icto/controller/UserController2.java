package com.sds.icto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping( "/user" )
public class UserController2 {

	@RequestMapping(value= "/join", method = RequestMethod.GET )
	@ResponseBody
	   public String form() { 
		return "form()";
	} 

	   @RequestMapping(value="join", method = RequestMethod.POST )
	   @ResponseBody
	   public String submit() {
		   return "submit()";
	   }	  

}
