package br.com.lsborges.model.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lsborges.model.EntidadeEndereco;

public interface EndereçoRepository extends JpaRepository<EntidadeEndereco, Long>{

	void save(List<EntidadeEndereco> endereço);

}
