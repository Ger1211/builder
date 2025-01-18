package io.github.ger1211.builder.builder;

import io.github.ger1211.builder.model.Person;

public class PersonBuilder extends AbstractPersistenceBuilder<Person> {

    private PersonBuilder() {
        this.instance = new Person();
    }

    public static PersonBuilder basic() {
        return new PersonBuilder();
    }
}
