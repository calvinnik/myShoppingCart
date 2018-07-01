package com.myshoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.myshoppingcart.dao.CategoryDAO;
import com.myshoppingcart.entity.Category;

@Controller
public class HomeController {
	
	@Autowired
	CategoryDAO categoryDAO;
	
	/*
	 * Code for HomePage
	 * */
	

	@RequestMapping(value= {"/", "/home"})
	public ModelAndView showHomePage() {
		
		ModelAndView mav = new ModelAndView("masterPage");
		mav.addObject("title", "Home");
		mav.addObject("homeTrue", true);
		
		//ADDING THE CATEGORY LIST TO THE MAV
		mav.addObject("categories", categoryDAO.getCatogoryList());
		return mav;
	}
	

	/*
	 * Code for AboutUs Page
	 * */
	
	@RequestMapping("/aboutUs")
	public ModelAndView showAbout() {
		
		ModelAndView mav = new ModelAndView("masterPage");
		mav.addObject("title", "About Us");
		mav.addObject("aboutTrue", true);
		return mav;
	}
	

	/*
	 * Code for ContactUs Page
	 * */
	
	@RequestMapping("/contactUs")
	public ModelAndView showContact() {
		
		ModelAndView mav = new ModelAndView("masterPage");
		mav.addObject("title", "Contact Us");
		mav.addObject("contactTrue", true);
		return mav;
	}
	

	/*
	 * Code for All Products
	 * */
	
	@RequestMapping("/show/allProducts")
	public ModelAndView showAllProducts() {
		
		ModelAndView mav = new ModelAndView("masterPage");
		mav.addObject("title", "All Products");
		mav.addObject("showAllTrue", true);
		
		//ADDING THE CATEGORY LIST TO THE MAV
		mav.addObject("categories", categoryDAO.getCatogoryList());
				
		return mav;
	}
	
	/*
	 * Code for Specific Category Products
	 * */
	
	@RequestMapping("/show/product/{id}")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		
		//Fetching the category
		Category category = categoryDAO.getCatogory(id);
		
		ModelAndView mav = new ModelAndView("masterPage");
		mav.addObject("title", category.getName());
		mav.addObject("showCategoryTrue", true);
		
		//ADDING THE CATEGORY LIST TO THE MAV
		mav.addObject("categories", categoryDAO.getCatogoryList());
		mav.addObject("category", category);

				
		return mav;
	}
}


//   /show/product/${catogories.id}    





