package com.lyzard.cursoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lyzard.cursoSpringBoot.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
