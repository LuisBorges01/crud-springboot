package br.com.lsborges.DTO;

import java.util.List;

import br.com.lsborges.model.Endereco;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {
	private Long id;
	
	private String name;
	private String birthDate;
	
	private List<Endereco> Address;
	private Endereco mainADRESS;
	

}
