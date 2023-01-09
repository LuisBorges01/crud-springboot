package br.com.lsborges.DTO.Config.Response;

import java.util.List;

public class ResponsePerson {
	  private Long id;
	    private String name;
	    private String birthdate;
	    public List<EnderecoResponse> address;
	    public EnderecoResponse mainAddress;
	    
	    
	    
	    
	    
		public ResponsePerson(Long id, String name, String birthdate, List<EnderecoResponse> address,
				EnderecoResponse mainAddress) {
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
		public List<EnderecoResponse> getAddress() {
			return address;
		}
		public void setAddress(List<EnderecoResponse> address) {
			this.address = address;
		}
		public EnderecoResponse getMainAddress() {
			return mainAddress;
		}
		public void setMainAddress(EnderecoResponse mainAddress) {
			this.mainAddress = mainAddress;
		} 
}
