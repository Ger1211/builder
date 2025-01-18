package com.test.utils.gmc.builder.builder;

public abstract class AbstractPersistenceBuilder<T> {

    public T instance;

    public T build() {
        return instance;
    }
}
