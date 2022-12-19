package com.lyzard.cursoSpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyzard.cursoSpringBoot.entities.Order;
import com.lyzard.cursoSpringBoot.repositories.OrderReoisitory;


@Service
public class OrderService {

	@Autowired
	private OrderReoisitory repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id){
		Optional<Order> obj = repository.findById(id);
		
		return obj.get();
	}
}
