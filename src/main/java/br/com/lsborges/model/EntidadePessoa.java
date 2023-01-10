package br.com.lsborges.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;



@Entity
public class EntidadePessoa implements Serializable{
	
	
    
	private static final long serialVersionUID = 1L;


	@OneToMany(mappedBy = "person", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<EntidadeEndereco> Address = new ArrayList<>();
	
    @Embedded
    private EntidadeEnderecoPrincipal mainAddress;
 
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
	
	public List<EntidadeEndereco> getAddress() {
		return Address;
	}
	public void setAddress(List<EntidadeEndereco> address) {
		Address = address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public EntidadeEnderecoPrincipal getMainAddress() {
		return mainAddress;
	}
	public void setMainAddress(EntidadeEnderecoPrincipal mainAddress) {
		this.mainAddress = mainAddress;
	}
	public EntidadePessoa(List<EntidadeEndereco> address, EntidadeEnderecoPrincipal mainAddress, Long id, String name,
			String birthDate) {
		super();
		Address = address;
		this.mainAddress = mainAddress;
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	public EntidadePessoa() {}
	
}
