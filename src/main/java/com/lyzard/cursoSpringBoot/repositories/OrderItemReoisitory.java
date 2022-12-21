package com.lyzard.cursoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lyzard.cursoSpringBoot.entities.OrderItem;

public interface OrderItemReoisitory extends JpaRepository<OrderItem, Long>{

	
	
}
