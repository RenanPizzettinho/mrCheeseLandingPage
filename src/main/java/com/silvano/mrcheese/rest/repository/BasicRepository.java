package com.silvano.mrcheese.rest.repository;

import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.PersistenceContext;
import java.util.List;

public abstract class BasicRepository<T>  {

    @PersistenceContext
    private EntityManager entityManager;

    public <T> T persist(T entity){
        entityManager.persist(entity);
        entityManager.flush();
        return entity;
    }

    public <T> T merge(T entity){
        entityManager.merge(entity);
        entityManager.flush();
        return entity;
    }

    public void remove(T entity){
        entityManager.remove(entity);
        entityManager.flush();
    }

    public <T> T find(Class<T> entityClass, Long id){
        return entityManager.find(entityClass, id, LockModeType.NONE);
    }

    public <T> List findAll(String query){
        return entityManager.createQuery(query).getResultList();
    }
}

