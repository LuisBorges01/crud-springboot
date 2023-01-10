package br.com.lsborges.DTO.Config.Response;

public class ResponseEndereco {
	 private Long id;
	   private String city;
	    private Long zipCode;
	    private String place;
	    private String number;
	
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public Long getZipCode() {
			return zipCode;
		}
		public void setZipCode(Long zipCode) {
			this.zipCode = zipCode;
		}
		public String getPlace() {
			return place;
		}
		public void setPlace(String place) {
			this.place = place;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public ResponseEndereco(String city, Long zipCode, String place, String number) {
			this.city = city;
			this.zipCode = zipCode;
			this.place = place;
			this.number = number;
		} 

	    
}
