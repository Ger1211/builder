package com.test.utils.gmc.builder.unit;

import com.test.utils.gmc.builder.BuilderApplicationTests;
import com.test.utils.gmc.builder.builder.PersonBuilder;
import com.test.utils.gmc.builder.model.Person;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.verify;

class AbstractPersistenceBuilderTests extends BuilderApplicationTests {

    @Mock
    private EntityManager entityManager;

    @Test
    void build_fromAnSubclassOfAbstractPersistenceBuilder_returnNonPersistedEntity() {
        Person entity = PersonBuilder.basic().build();

        assertNotNull(entity);
        assertNull(entity.getId());
    }

    @Test
    void build_withEntityManager_returnAPersistedEntity() {
        Person entity = PersonBuilder.basic().build(entityManager);

        verify(entityManager).persist(entity);
        assertNotNull(entity);
    }
}
