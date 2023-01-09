package br.com.lsborges.model.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lsborges.model.EntidadePessoa;

public interface PRepository extends JpaRepository<EntidadePessoa, Long> {
}
