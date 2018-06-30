package com.myshoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value= {"/", "/home"})
	public ModelAndView showHomePage() {
		
		ModelAndView mav = new ModelAndView("masterPage");
		mav.addObject("title", "Home");
		mav.addObject("homeTrue", true);
		return mav;
	}
	
	@RequestMapping("/aboutUs")
	public ModelAndView showAbout() {
		
		ModelAndView mav = new ModelAndView("masterPage");
		mav.addObject("title", "About Us");
		mav.addObject("aboutTrue", true);
		return mav;
	}
	
	@RequestMapping("/contactUs")
	public ModelAndView showContact() {
		
		ModelAndView mav = new ModelAndView("masterPage");
		mav.addObject("title", "Contact Us");
		mav.addObject("contactTrue", true);
		return mav;
	}
}
