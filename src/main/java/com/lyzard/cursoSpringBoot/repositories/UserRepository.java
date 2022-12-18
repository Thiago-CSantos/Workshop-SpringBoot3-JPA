package com.lyzard.cursoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lyzard.cursoSpringBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
