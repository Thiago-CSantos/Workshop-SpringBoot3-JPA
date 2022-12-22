package com.lyzard.cursoSpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyzard.cursoSpringBoot.entities.User;
import com.lyzard.cursoSpringBoot.repositories.UserRepository;
import com.lyzard.cursoSpringBoot.service.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id){
		Optional<User> obj = repository.findById(id);
		
		//return obj.get(); metodo comum de retornar sem uma exeção
		
		return obj.orElseThrow( () -> new ResourceNotFoundException(id) );
	}
	
	//função inserir novo usúario
	public User insert(User obj) {
		return this.repository.save(obj);  //Savar um novo usuario
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}
	
}
