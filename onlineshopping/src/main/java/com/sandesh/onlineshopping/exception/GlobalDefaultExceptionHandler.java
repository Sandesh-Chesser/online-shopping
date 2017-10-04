package com.sandesh.onlineshopping.exception;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {

	@ExceptionHandler(value=NoHandlerFoundException.class)
	public ModelAndView handleNoHandlerFound() {
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("title", "Error- 404 Not Found");
		mv.addObject("errorTitle", "Page Not Found!!");
		mv.addObject("errorDescription", "The page you requested is not available..");
		return mv;
	}
	
	@ExceptionHandler(value=ProductNotFoundException.class)
	public ModelAndView handleProductNotFound(ProductNotFoundException ex) {
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("title", "Error- 500 Prodcut");
		mv.addObject("errorTitle", ex.getMessage());
		mv.addObject("errorDescription", "The product you requested is not available...");
		return mv;
	}
	
	@ExceptionHandler(value=CategoryNotFoundException.class)
	public ModelAndView handleCategoryNotFound(CategoryNotFoundException ex) {
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("title", "Error- 500 Category");
		mv.addObject("errorTitle", ex.getMessage());
		mv.addObject("errorDescription", "The category you requested is not available..");
		return mv;
	}
	
	@ExceptionHandler(value=Exception.class)
	public ModelAndView handleGeneral(Exception ex) {
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("title", "Error- 500");
		mv.addObject("errorTitle", "Contact Your Administrator!!");
		mv.addObject("errorDescription", "Please donot alter the URL parameters");
		return mv;
	}
}
