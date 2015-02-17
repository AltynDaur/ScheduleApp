package dao.jpaimpl;

import dao.JPA;
import dao.StudentDAO;
import entity.Student;

import javax.inject.Inject;
import javax.persistence.EntityManager;

@JPA
public class JPAStudentDAO implements StudentDAO {
    @Inject
    private EntityManager entityManager;
    @Override
    public Student find(long id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    public void add(Student student) {
        entityManager.merge(student);
    }

    @Override
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    public void delete(long id) {
        entityManager.remove(entityManager.find(Student.class,id));
    }
}
