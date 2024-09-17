package br.uepg.mini_curso.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Mensagem {

    public Mensagem() {}

    public Mensagem(String corpo, String usuario) {
        this.corpo = corpo;
        this.usuario = usuario;
    }

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String corpo;

    @Column
    private String usuario;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

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
