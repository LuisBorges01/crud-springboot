package br.com.lsborges.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.lsborges.DTO.Config.Request.RequestPerson;
import br.com.lsborges.model.EntidadeEndereco;
import br.com.lsborges.model.EntidadePessoa;
import br.com.lsborges.service.PersonServices;

@RestController
@RequestMapping("/person")
public class PersonController {
		
	@Autowired
	private PersonServices services;
	
	
	@PostMapping()
    @ResponseStatus(HttpStatus.CREATED)	
	public RequestPerson create(@RequestBody RequestPerson person) {
		return services.createPerson(person);			
	}
	
	@PostMapping("/ed")
	@ResponseStatus(HttpStatus.CREATED)	
	public EntidadeEndereco createAddress(EntidadeEndereco person) {
		return services.createAddress(person);			
	}
	
	@GetMapping()
	@ResponseStatus(HttpStatus.OK) /*OK*/
	public List<EntidadePessoa> findAll() {
		return services.findAllService();
	}
	
}
