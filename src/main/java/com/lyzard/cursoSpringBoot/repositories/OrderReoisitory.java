package com.lyzard.cursoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lyzard.cursoSpringBoot.entities.Order;

public interface OrderReoisitory extends JpaRepository<Order, Long>{

	
	
}
