package dao;

import entity.Student;

/**
 * Created by admin on 2/17/2015.
 */
public interface StudentDAO {
    public Student find(long id);
    public void add(Student student);
    public  void update(Student student);
    public void delete(long id);
}
