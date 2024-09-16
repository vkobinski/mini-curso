package br.uepg.mini_curso.repository;

import br.uepg.mini_curso.models.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
}
