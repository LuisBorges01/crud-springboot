package br.com.lsborges.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lsborges.DTO.Config.Request.RequestPerson;
import br.com.lsborges.DTO.PersonMapper.PersonMapper;
import br.com.lsborges.model.EntidadeEndereco;
import br.com.lsborges.model.EntidadePessoa;
import br.com.lsborges.model.respository.EndereçoRepository;
import br.com.lsborges.model.respository.PRepository;
@Service
public class PersonServices {
	
	@Autowired
	private PRepository personRepository;
	
	@Autowired
	private EndereçoRepository enderecoRepository;
	
	@Autowired
	public PersonMapper mapper;
	
	 /**/
	public RequestPerson createPerson(RequestPerson request) {
		EntidadePessoa pessoa = mapper.toPerson(request);
		personRepository.save(pessoa);
		return request;
	}
	/**/
}	