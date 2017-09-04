package com.silvano.mrcheese.rest.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "INTERESSADOS")
public class Interessado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "NOME")
    @Size(max = 255, message = "O atributo nome deve ter no máximo {max} caracteres")
    private String nome;

    @NotNull
    @Column(name = "EMAIL")
    @Size(max = 255, message = "O atributo email deve ter no máximo {max} caracteres")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
