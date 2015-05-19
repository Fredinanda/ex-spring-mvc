package com.sds.icto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.sds.icto.guestbookVo.GuestbookVo;


@Controller
@RequestMapping("/guestbook")
public class guestbookController {

	@RequestMapping("/list")
	public String list(){
		return "/views/guestbook/list.jsp";
	}
	
	
	
	@RequestMapping("/insert")
	public String insert(
			/*@RequestParam String name,
			@RequestParam String password,
			@RequestParam String content*/
			
			//@ModelAttribute GuestbookVo vo
			
			GuestbookVo vo,
			Model model
			){
		
		//model.addAttribute(vo);
		//==model.addAttribute("vo", vo);
		
		model.addAttribute("guestbook", vo);
		
		return "/views/guestbook/info.jsp";
	}
	
	@RequestMapping("/insert2")
	public ModelAndView insert2 (GuestbookVo vo){
		ModelAndView mav = new ModelAndView();
		mav.addObject("guestbook", vo);
		mav.setViewName("/views/guestbook/info.jsp");
		
		return mav;
	}
	
	
	
	
	@RequestMapping(value = "/delete/{no}", method=RequestMethod.POST)
	public String delete(@PathVariable Long no){
		return "guestbookController.delete("+ no +")";
	}
	
	@RequestMapping(value = "/delete/{no}", method=RequestMethod.GET)
	public String deleteForm(@PathVariable Long no){
		return "guestbookController.delete("+ no +")";
	}
	
}
