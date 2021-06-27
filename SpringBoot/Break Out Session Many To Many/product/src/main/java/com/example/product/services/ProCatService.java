package com.example.product.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.product.models.Category;
import com.example.product.models.Product;
import com.example.product.repositories.CategoryRepository;
import com.example.product.repositories.ProductRepository;
@Service
public class ProCatService {
	private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    
    
    
	public ProCatService(CategoryRepository categoryRepository, ProductRepository productRepository) {
		this.categoryRepository = categoryRepository;
		this.productRepository = productRepository;
	}
	public Product creatProduct(Product product) {
		return productRepository.save(product);
	}
	public Category creayeCategory (Category category) {
		return categoryRepository.save(category);
	}
	public List<Product> findAllProduct(){
		return productRepository.findAll();
	}
	public List<Category> findAllCategories(){
		return categoryRepository.findAll();
	}
	public Product findProduct(Long id){
        Optional<Product> optionalProduct = productRepository.findById(id);
        if(optionalProduct.isPresent()){
            return optionalProduct.get();
        }else {
            return null;
        }
	}
        public Category findCategory(Long id){
            Optional<Category> optionalCategory = categoryRepository.findById(id);
            if(optionalCategory.isPresent()){
                return optionalCategory.get();
            }else {
                return null;
            }
        }
        
      public List<Category> allCategoriesExept(Product product){
    	  return categoryRepository.findByProductsNotContains(product);
      }
        
}
