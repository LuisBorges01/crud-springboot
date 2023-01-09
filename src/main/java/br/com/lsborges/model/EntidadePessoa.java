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
public class EntidadePessoa implements Serializable{
	
	
    
	private static final long serialVersionUID = 1L;


	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
	private List<EntidadeEndereco> Address;
    private EntidadeEndereco mainAddress;
 
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    
    
	@Column(name = "name")
	private String name;
	@Column(name = "birthDate")
	private String birthDate;
	
	
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
	
	
	public EntidadePessoa(List<EntidadeEndereco> address, EntidadeEndereco mainAddress, Long id, String name,
			String birthDate) {
		Address = address;
		this.mainAddress = mainAddress;
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	public EntidadePessoa() {}
	
}
