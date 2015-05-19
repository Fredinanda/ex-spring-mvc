package com.sds.icto.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ex1Controller {
	  @RequestMapping( "/hello" )
	  @ResponseBody
	  public String hello() { 
		  return "ex1Controller.hello()";
	  } 
	                
	  @RequestMapping( "/main" )
	  @ResponseBody
	  public void main( HttpServletResponse response) {
		 try{
		  PrintWriter out = response.getWriter();
		  out.println("main()");
		 }catch(Exception e){
			 e.printStackTrace();
		 }
	  }	  
}
