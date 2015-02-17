package dao.jpaimpl;

import dao.GroupDAO;
import dao.JPA;
import entity.Group;

import javax.inject.Inject;
import javax.persistence.EntityManager;

@JPA
public class JPAGroupDAO implements GroupDAO{
    @Inject
    private EntityManager entityManager;
    @Override
    public Group find(long id) {
        return entityManager.find(Group.class,id);
    }

    @Override
    public void add(Group group) {
        entityManager.merge(group);
    }

    @Override
    public void update(Group group) {
        entityManager.merge(group);
    }

    @Override
    public void delete(long id) {
        entityManager.remove(entityManager.find(Group.class,id));
    }
}
