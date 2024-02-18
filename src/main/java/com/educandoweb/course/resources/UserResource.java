package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController // fala que a classe vai responder requisições
@RequestMapping(value = "/users") // fala a rota que vai ser respondida
public class UserResource {
	
	// ResponseEntity -> representa uma resposta de uma requisição
	// GetMapping -> diz que vai responder uma requisição do tipo get
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "98752411", "123457");
		return ResponseEntity.ok().body(u);
	}
	
}
