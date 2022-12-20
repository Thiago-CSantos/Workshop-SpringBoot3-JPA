package com.lyzard.cursoSpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyzard.cursoSpringBoot.entities.Product;
import com.lyzard.cursoSpringBoot.repositories.ProductReoisitory;


@Service
public class ProductService {

	@Autowired
	private ProductReoisitory repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id){
		Optional<Product> obj = repository.findById(id);
		
		return obj.get();
	}
}
