package com.example.product.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.product.models.Category;
import com.example.product.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	List <Product> findAll();
	List <Product> findByCategoriesNotContains(Category category);
}
