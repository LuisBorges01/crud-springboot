package br.com.lsborges.DTO.Config.Request;


public class RequestEndereco {
	
	private String zipCode;
	private String place;
	private String city;
	private String number;
	
	
	
	public RequestEndereco(String zipCode, String place, String city, String number) {
		this.zipCode = zipCode;
		this.place = place;
		this.city = city;
		this.number = number;
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
