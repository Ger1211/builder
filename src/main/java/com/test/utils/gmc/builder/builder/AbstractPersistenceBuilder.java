package com.test.utils.gmc.builder.builder;

import jakarta.persistence.EntityManager;

public abstract class AbstractPersistenceBuilder<T> {

    public T instance;

    public T build() {
        return instance;
    }

    public T build(EntityManager entityManager) {
        entityManager.persist(instance);
        return instance;
    }
}
