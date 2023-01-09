package br.com.lsborges.DTO.Config.Request;

import br.com.lsborges.DTO.Config.Response.EnderecoResponse;

public class RequestPerson {
	
    private String name;
    private String birthdate;
    private EnderecoResponse address;
    
    
	public RequestPerson(Long id, String name, String birthdate, EnderecoResponse address) {
		this.name = name;
		this.birthdate = birthdate;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public EnderecoResponse getAddress() {
		return address;
	}
	public void setAddress(EnderecoResponse address) {
		this.address = address;
	}
    
    

}
