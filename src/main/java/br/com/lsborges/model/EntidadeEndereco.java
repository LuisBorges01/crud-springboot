package br.com.lsborges.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class EntidadeEndereco implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pessoa_id")
	private EntidadePessoa person;
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "zipCode")
	private String zipCode;
	@Column(name = "place")
	private String place;
	@Column(name = "city")
	private String city;
	@Column(name = "number")
	private String number;
	
	
	public EntidadeEndereco() {}	
	
	public EntidadeEndereco(EntidadePessoa person, Long id, String zipCode, String place, String city, String number) {
		this.person = person;
		this.id = id;
		this.zipCode = zipCode;
		this.place = place;
		this.city = city;
		this.number = number;
	}

	public EntidadePessoa getPerson() {
		return person;
	}

	public void setPerson(EntidadePessoa person) {
		this.person = person;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	

}
