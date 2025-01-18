package com.test.utils.gmc.builder.unit;

import com.test.utils.gmc.builder.BuilderApplicationTests;
import com.test.utils.gmc.builder.builder.PersonBuilder;
import com.test.utils.gmc.builder.model.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class AbstractPersistenceBuilderTests extends BuilderApplicationTests {

    @Test
    void build_fromAnSubclassOfAbstractPersistenceBuilder_returnNonPersistedEntity() {
        Person entity = PersonBuilder.basic().build();

        assertNotNull(entity);
        assertNull(entity.getId());
    }
}
