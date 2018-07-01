package com.myshoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.myshoppingcart.dao.CategoryDAO;

@Controller
public class HomeController {
	
	@Autowired
	CategoryDAO categoryDAO;

	@RequestMapping(value= {"/", "/home"})
	public ModelAndView showHomePage() {
		
		ModelAndView mav = new ModelAndView("masterPage");
		mav.addObject("title", "Home");
		mav.addObject("homeTrue", true);
		
		//ADDING THE CATEGORY LIST TO THE MAV
		mav.addObject("categories", categoryDAO.getCatogoryList());
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
