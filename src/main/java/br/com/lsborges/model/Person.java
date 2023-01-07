package br.com.lsborges.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Person implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
	private List<Endereco> Address;
    
    private Endereco mainAddress;
    
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	/*          -          */
	@Column(name = "name")
	private String name;
	@Column(name = "birthDate")
	private String birthDate;

	

	public Person() {}

	

	public Person(List<Endereco> address, Endereco mainAddress,  String name, String birthDate) {
		Address = address;
		this.mainAddress = mainAddress;
		this.name = name;
		this.birthDate = birthDate;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public List<Endereco> getEndereço() {
		return Address;
	}
	public void setEndereço(List<Endereco> Address) {
		this.Address = Address;
	}



	public List<Endereco> getAddress() {
		return Address;
	}



	public void setAddress(List<Endereco> address) {
		Address = address;
	}



	public Endereco getMainAddress() {
		return mainAddress;
	}



	public void setMainAddress(Endereco mainAddress) {
		this.mainAddress = mainAddress;
	}
	
}
