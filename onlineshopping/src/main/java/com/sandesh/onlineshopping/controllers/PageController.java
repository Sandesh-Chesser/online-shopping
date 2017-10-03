package com.sandesh.onlineshopping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sandesh.shoppingbackend.dao.CategoryDAO;
import com.sandesh.shoppingbackend.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value= {"/","/home"}, method=RequestMethod.GET)
	public String goHome(ModelMap model) {
		model.addAttribute("title","Home");
		model.addAttribute("userClickHome",true);
		model.addAttribute("categories", categoryDAO.list());
		return "page";
	}	
	
	@RequestMapping(value= {"/about"}, method=RequestMethod.GET)
	public String about(ModelMap model) {
		model.addAttribute("title","About Us");
		model.addAttribute("userClickAbout",true);
		return "page";
	}
	
	@RequestMapping(value= {"/contact"}, method=RequestMethod.GET)
	public String contact(ModelMap model) {
		model.addAttribute("title","Contact Us");
		model.addAttribute("userClickContact",true);
		return "page";
	}
	
	@RequestMapping(value= {"/show/all/products"}, method=RequestMethod.GET)
	public String showAllProducts(ModelMap model) {
		model.addAttribute("title","All Products");
		model.addAttribute("userClickAllProducts",true);
		model.addAttribute("categories", categoryDAO.list());
		return "page";
	}
	
	@RequestMapping(value= "/show/category/{id}/products", method=RequestMethod.GET)
	public String showCategoryProducts(ModelMap model, @PathVariable Integer id) {
		Category category = categoryDAO.get(id);
		model.addAttribute("title", category.getName());
		model.addAttribute("categories", categoryDAO.list());
		model.addAttribute("category", category);
		model.addAttribute("userClickCategoryProducts", true);
		return "page";
	}
}
