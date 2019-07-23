package com.mavrik.baraati.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	
	@GetMapping("showAdvForm")
	public String showAdvForm(Model model) {
		
		return "master/item/addItem";
	}
	
	@GetMapping("showCategoryForm")
	public String showCategoryForm(Model model) {
		
		return "master/category/addCategory";
	}
	
	@GetMapping("showSubCategoryForm")
	public String showSubCategoryForm(Model model) {
		
		return "master/subcategory/addSubCategory";
	}
}
