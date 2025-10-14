package com.tuxmarrento.project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tuxmarrento.project.entities.User;

/* 'annotation' para indicar ao Spring que essa classe
 * é um recurso web implementado por um controlador
 * Rest: */
@RestController
// inserção do caminho para o request:
@RequestMapping(value = "/users")
public class UserResource {

	/* tipo generics específico do Spring para retornar 
	 * requests, indicado pela 'annotation' '@GetMapping': */
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
		return ResponseEntity.ok().body(u);	
	}
}
