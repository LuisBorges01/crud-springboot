package br.com.lsborges.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class EntidadeEnderecoPrincipal {
	private String principalZipCode;
	private String principalPlace;
	private String principalCity;
	private String pricipalNumber;
	
	public String getPrincipalZipCode() {
		return principalZipCode;
	}
	public void setPrincipalZipCode(String principalZipCode) {
		this.principalZipCode = principalZipCode;
	}
	public String getPrincipalPlace() {
		return principalPlace;
	}
	public void setPrincipalPlace(String principalPlace) {
		this.principalPlace = principalPlace;
	}
	public String getPrincipalCity() {
		return principalCity;
	}
	public void setPrincipalCity(String principalCity) {
		this.principalCity = principalCity;
	}
	public String getPricipalNumber() {
		return pricipalNumber;
	}
	public void setPricipalNumber(String pricipalNumber) {
		this.pricipalNumber = pricipalNumber;
	}

	
}
