package br.com.vigabies.vitoriaAPI.repository;

import br.com.vigabies.vitoriaAPI.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
