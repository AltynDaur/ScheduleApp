package resources;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class Resources {
    @PersistenceContext(unitName = "Schedule")
    @Produces
    private EntityManager entityManager;
}
