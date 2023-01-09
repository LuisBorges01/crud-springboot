package br.com.lsborges.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.lsborges.DTO.Config.Request.RequestPerson;
import br.com.lsborges.service.PersonServices;

@RestController
@RequestMapping("/person")
public class PersonController {
		
	@Autowired
	private PersonServices services;
	
	
	@PostMapping()
    @ResponseStatus(HttpStatus.CREATED)	
	public RequestPerson create(@RequestBody RequestPerson request) {
		return services.createPerson(request);			
	}
	
	
}
