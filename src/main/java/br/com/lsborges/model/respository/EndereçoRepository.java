package br.com.lsborges.model.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lsborges.model.Endereco;

public interface EndereçoRepository extends JpaRepository<Endereco, Long>{

	void save(List<Endereco> endereço);

}
