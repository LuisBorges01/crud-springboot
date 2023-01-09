package br.com.lsborges.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	
	public RequestPerson createPerson(RequestPerson person) {
		EntidadePessoa pessoa = mapper.toPerson(person);
		personRepository.save(pessoa);
		return person;
	}
	
	public EntidadeEndereco createAddress(EntidadeEndereco endereco) {
		return enderecoRepository.save(endereco);
	}
	
	public ResponseEntity<EntidadePessoa> uptadeService(long id, EntidadePessoa personReceived){
		Optional<EntidadePessoa> personExistis = personRepository.findById(id);
			
			EntidadePessoa newPerson = personExistis.get();
			newPerson.setName(personReceived.getName());
			newPerson.setBirthDate(personReceived.getBirthDate());
			//newPerson.setEndereço(personReceived.getEndereço());
			return new ResponseEntity<EntidadePessoa>(personRepository.save(newPerson), HttpStatus.OK);
	}
	
	public Optional<EntidadePessoa> findByIdService(Long id) throws Exception {
		return personRepository.findById(id);
		}
	

	public List<EntidadePessoa> findAllService(){
		return personRepository.findAll();
	}	
	
	/*
	public Person newAddresPerson(Long id, List<Endereco> enderecoReceived) {
		Optional<Person> newAddress = personRepository.findById(id);
		Person novoEndereco = newAddress.get();
		novoEndereco.setEndereço(enderecoReceived);
		return novoEndereco;
	}
	
	public Person setAddress(Long id, List<Endereco> enderecoReceived) {
		Optional<Person> newAddress = personRepository.findById(id);
		Person novoEndereco = newAddress.get();
		novoEndereco.setEndereço(enderecoReceived);
		return novoEndereco;
		}
	
	public List<Endereco> addressForPerson(Long id) {
		Optional<Person> busqueId = personRepository.findById(id);
		Person address = busqueId.get();
		return address.getEndereço();
		}
	
	public Endereco principalAddress(Long id) {
		Optional<Person> busqueId = personRepository.findById(id);
		Person address = busqueId.get();
		return address.getMainAddress();
	}
		
		/*try {
			findByIdService(id);
		} catch (Exception e) {
			System.out.print("ID INVÁLIDO!");
		}
		Optional<Person> idPerson = personRepository.findById(id);
		Person newAddressPerson = idPerson.get();
		newAddressPerson.setEndereço(endereco);
		return Optional.ofNullable(newAddressPerson);	*/
	
}
