package com.lyzard.cursoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lyzard.cursoSpringBoot.entities.Product;

public interface ProductReoisitory extends JpaRepository<Product, Long>{

	
	
}
