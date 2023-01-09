package br.com.lsborges.DTO.Config.Response;

import java.util.List;

public class ResponsePerson {
	  private Long id;
	    private String name;
	    private String birthdate;
	    public ResponseEndereco mainAddress;
	    public List<ResponseEndereco> Address;
	    

	    
		public ResponsePerson(Long id, String name, String birthdate, ResponseEndereco mainAddress,
				List<ResponseEndereco> address) {
			this.id = id;
			this.name = name;
			this.birthdate = birthdate;
			this.mainAddress = mainAddress;
			Address = address;
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
