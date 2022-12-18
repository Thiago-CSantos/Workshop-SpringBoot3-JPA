package com.lyzard.cursoSpringBoot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.lyzard.cursoSpringBoot.entities.User;
import com.lyzard.cursoSpringBoot.repositories.UserRepository;

@Configuration
@Profile("test") // <---- ira rodar o a classe somente se estiver nesse perfil
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepo;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		
		userRepo.saveAll(Arrays.asList(u1,u2)); //saveAll recebe uma list
	}
}
