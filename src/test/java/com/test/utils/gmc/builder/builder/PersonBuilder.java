package com.test.utils.gmc.builder.builder;

import com.test.utils.gmc.builder.model.Person;

public class PersonBuilder extends AbstractPersistenceBuilder<Person> {

    private PersonBuilder() {
        this.instance = new Person();
    }

    public static PersonBuilder basic() {
        return new PersonBuilder();
    }
}
