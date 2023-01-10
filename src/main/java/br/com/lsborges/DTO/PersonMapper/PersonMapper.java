package br.com.lsborges.DTO.PersonMapper;

import java.util.List;
import java.util.stream.Collectors;

import javax.print.DocFlavor.READER;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.lsborges.DTO.Config.Request.RequestEndereco;
import br.com.lsborges.DTO.Config.Request.RequestPerson;
import br.com.lsborges.DTO.Config.Response.ResponsePerson;
import br.com.lsborges.model.EntidadeEndereco;
import br.com.lsborges.model.EntidadePessoa;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PersonMapper {
	
	@Autowired
    private  ModelMapper mapper;

	/**/
    public EntidadePessoa toPerson(RequestPerson request) { /*Request to EntidadePerson*/
    	return mapper.map(request, EntidadePessoa.class);
    }
   /**/
    public ResponsePerson toPersonResponse(EntidadePessoa person) {/*EntidadePerson to PersonResponse(getters)*/
        return mapper.map(person, ResponsePerson.class);
    }
   /**/

    public List<ResponsePerson> toPersonResponseList(List<EntidadePessoa> person) {
        return person.stream() /*ListPerson for listPacienteResponse*/
                .map(this::toPersonResponse)
                .collect(Collectors.toList());
    }
    /**/
    public EntidadeEndereco toEndereco(RequestEndereco request) {
    	return mapper.map(request, EntidadeEndereco.class);
    }

}
