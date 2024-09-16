package br.uepg.mini_curso.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mensagem {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
