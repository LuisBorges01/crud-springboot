package br.com.lsborges.DTO;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDTO {
	private Long id;
	
	@Id
	private String zipCode;
	private String place;
	private String city;
	private String number;

}
