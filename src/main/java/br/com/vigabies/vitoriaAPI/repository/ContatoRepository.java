package br.com.vigabies.vitoriaAPI.repository;

import br.com.vigabies.vitoriaAPI.Model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository  extends JpaRepository<Contato, Long> {
}
