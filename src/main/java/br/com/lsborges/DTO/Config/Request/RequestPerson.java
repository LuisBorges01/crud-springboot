package br.com.lsborges.DTO.Config.Request;

import java.util.List;

import br.com.lsborges.DTO.Config.Response.ResponseEndereco;

public class RequestPerson {
	
    private String name;
    private String birthdate;
    private ResponseEndereco mainAddress;
    private List<ResponseEndereco> Address;
    
   
	public RequestPerson(String name, String birthdate, ResponseEndereco mainAddress, List<ResponseEndereco> address) {
		this.name = name;
		this.birthdate = birthdate;
		this.mainAddress = mainAddress;
		Address = address;
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

	public ResponseEndereco getMainAddress() {
		return mainAddress;
	}

	public void setMainAddress(ResponseEndereco mainAddress) {
		this.mainAddress = mainAddress;
	}

	public List<ResponseEndereco> getAddress() {
		return Address;
	}

	public void setAddress(List<ResponseEndereco> address) {
		Address = address;
	}
    
}
