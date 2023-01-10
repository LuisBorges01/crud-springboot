package br.com.lsborges.DTO.Config.Request;

import java.util.List;

import br.com.lsborges.DTO.Config.Response.ResponseEndereco;
import br.com.lsborges.model.EntidadeEnderecoPrincipal;

public class RequestPerson {
	 private Long id;

	
    private String name;
    private String birthdate;
    private EntidadeEnderecoPrincipal mainAddress;
    private List<ResponseEndereco> address;

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
	public EntidadeEnderecoPrincipal getMainAddress() {
		return mainAddress;
	}
	public void setMainAddress(EntidadeEnderecoPrincipal mainAddress) {
		this.mainAddress = mainAddress;
	}
	public List<ResponseEndereco> getAddress() {
		return address;
	}
	public void setAddress(List<ResponseEndereco> address) {
		this.address = address;
	}
	public RequestPerson(String name, String birthdate, EntidadeEnderecoPrincipal mainAddress,
			List<ResponseEndereco> address) {
		this.name = name;
		this.birthdate = birthdate;
		this.mainAddress = mainAddress;
		this.address = address;
	}
	
	public RequestPerson(List<ResponseEndereco> address) {
		this.address = address;
	}
    
    
    
}
