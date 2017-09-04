package com.silvano.mrcheese.rest.builder;

public abstract class MrCheeseBuilder <T, E extends MrCheeseBuilder>{

    protected T entity;

    public MrCheeseBuilder(T entity) {
        this.entity = entity;
    }

    public T build(){
        return entity;
    }
}
