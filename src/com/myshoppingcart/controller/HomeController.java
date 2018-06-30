package com.myshoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView showHomePage() {
		
		ModelAndView mav = new ModelAndView("masterPage");
		mav.addObject("message", "This is a TEST Message");
		return mav;
	}
}
