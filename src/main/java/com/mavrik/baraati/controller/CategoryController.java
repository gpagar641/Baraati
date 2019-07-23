package com.mavrik.baraati.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mavrik.baraati.model.Categories;
import com.mavrik.baraati.model.SubCategories;
import com.mavrik.baraati.repository.CategoryRepository;
import com.mavrik.baraati.repository.SubCategoryRepository;

@Controller
@RequestMapping("category")
public class CategoryController {

	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	SubCategoryRepository subCategoryRepository;

	@PostMapping("/insertCategory")
	public Categories insertCategory(HttpServletRequest request, @RequestBody Categories categories) {

		return categoryRepository.save(categories);
	}
	
	@GetMapping("/getAllCategories")
	public List<Categories> getAllCategories() {
		
		
		return categoryRepository.findByIsUsed(0);
	}
	
	@PostMapping("/insertSubCategory")
	public SubCategories insertCategory(HttpServletRequest request, @RequestBody SubCategories subCategories) {

		return subCategoryRepository.save(subCategories);
	}
	
	
	@GetMapping("/getAllSubCategories")
	public List<SubCategories> getAllSubCategories() {
		
		
		return subCategoryRepository.findByIsUsed(0);
	}

}
