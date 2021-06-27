package com.example.product.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.product.models.Category;
import com.example.product.models.Product;
import com.example.product.services.ProCatService;


@Controller
public class StoreController {
	private final ProCatService proCatService;

	public StoreController(ProCatService proCatService) {
		this.proCatService = proCatService;
	}
	@RequestMapping("/products/new")
	public String newProduct(@ModelAttribute("product")Product product) {
		
		return "product.jsp";
	}
	@RequestMapping(value = "/product", method = RequestMethod.POST)
    public String addProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
        if (result.hasErrors()) {
            return "product.jsp";
        } else {
            Product product1 = proCatService.creatProduct(product);
            return "redirect:/products/new";
        }
    }
	//.................................
	
	@RequestMapping("/category/new")
	public String newCategory(@ModelAttribute("category")Category category) {
		
		return "category.jsp";
	}
	@RequestMapping(value = "/category", method = RequestMethod.POST)
    public String addCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
        if (result.hasErrors()) {
            return "category.jsp";
        } else {
        	Category category1 = proCatService.creayeCategory(category);
            return "redirect:/category/new";
        }
    }
	@RequestMapping("/products/{id}")
	public String showProduct (Model model,@PathVariable("id")Long id) {
		Product product1 = proCatService.findProduct(id);
		model.addAttribute("productfromcontroller",product1);
		
		return "showProduct.jsp";
		
	}
}
