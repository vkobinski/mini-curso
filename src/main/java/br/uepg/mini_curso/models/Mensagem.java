package br.uepg.mini_curso.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Mensagem {

    public Mensagem() {}

    public Mensagem(String corpo) {
        this.corpo = corpo;
    }

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String corpo;

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
