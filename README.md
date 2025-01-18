# Reference Documentation

### Custom Builders
This is how you should create yours custom Builders

```java
public class PersonBuilder extends AbstractPersistenceBuilder<Person> {

    private PersonBuilder() {
        this.instance = new Person();
    }

    public static PersonBuilder basic() {
        return new PersonBuilder();
    }
}
```

### Testing
The following code shows an example of how a test is performed using a custom builder.

```java
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
```

Remember to use the @DataJpaTest to correctly configure the environment to run your tests. Among other things, it is necessary to generate a transaction and for the entity manager to persist your entities.