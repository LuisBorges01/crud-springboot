package br.com.lsborges.DTO.Config.Response;

import java.util.List;

public class ResponsePerson {
	  private Long id;
	    private String name;
	    private String birthdate;
	    public List<ResponseEndereco> address;
	    public ResponseEndereco mainAddress;
	    
	    
	    
	    
	    
		public ResponsePerson(Long id, String name, String birthdate, List<ResponseEndereco> address,
				ResponseEndereco mainAddress) {
			this.id = id;
			this.name = name;
			this.birthdate = birthdate;
			this.address = address;
			this.mainAddress = mainAddress;
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
		public List<ResponseEndereco> getAddress() {
			return address;
		}
		public void setAddress(List<ResponseEndereco> address) {
			this.address = address;
		}
		public ResponseEndereco getMainAddress() {
			return mainAddress;
		}
		public void setMainAddress(ResponseEndereco mainAddress) {
			this.mainAddress = mainAddress;
		} 
}
