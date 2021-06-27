package com.example.product.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.product.models.Category;
import com.example.product.models.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
	List <Category> findAll();
	List <Category> findByProductsNotContains(Product products);


}
