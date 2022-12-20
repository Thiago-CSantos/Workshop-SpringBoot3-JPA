package com.lyzard.cursoSpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyzard.cursoSpringBoot.entities.Category;
import com.lyzard.cursoSpringBoot.repositories.CategoryReoisitory;


@Service
public class CategoryService {

	@Autowired
	private CategoryReoisitory repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id){
		Optional<Category> obj = repository.findById(id);
		
		return obj.get();
	}
}
