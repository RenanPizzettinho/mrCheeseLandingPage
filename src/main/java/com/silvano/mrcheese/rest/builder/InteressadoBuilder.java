package com.silvano.mrcheese.rest.builder;

import com.silvano.mrcheese.rest.model.Interessado;

public class InteressadoBuilder extends MrCheeseBuilder<Interessado, InteressadoBuilder> {

    private Long id;
    private String nome;
    private String email;

    private InteressadoBuilder(Interessado entity) {
        super(entity);
    }

    public static InteressadoBuilder create() {
        return new InteressadoBuilder(new Interessado());
    }

    public static InteressadoBuilder from(Interessado interessado) {
        return new InteressadoBuilder(interessado);
    }

    private InteressadoBuilder id(Long id) {
        entity.setId(id);
        return this;
    }

    private InteressadoBuilder nome(String nome) {
        entity.setNome(nome);
        return this;
    }

    private InteressadoBuilder email(String email) {
        entity.setEmail(email);
        return this;
    }
}
