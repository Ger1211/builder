package io.github.ger1211.builder.integration;

import io.github.ger1211.builder.builder.PersonBuilder;
import io.github.ger1211.builder.model.Person;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
class AbstractPersistenceBuilderTests {

    @Autowired
    private EntityManager entityManager;

    @Test
    void build_withEntityManager_returnPersistedEntity() {
        Person entity = PersonBuilder.basic().build(entityManager);

        assertNotNull(entity);
        assertNotNull(entity.getId());
    }
}
