package com.lyzard.cursoSpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyzard.cursoSpringBoot.entities.User;
import com.lyzard.cursoSpringBoot.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id){
		Optional<User> obj = repository.findById(id);
		
		return obj.get();
	}
	
	//função inserir novo usúario
	public User insert(User obj) {
		return this.repository.save(obj);  //Savar um novo usuario
	}
	
}
