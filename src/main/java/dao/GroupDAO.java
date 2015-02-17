package dao;

import entity.Group;

/**
 * Created by admin on 2/17/2015.
 */
public interface GroupDAO {
    public Group find(long id);
    public void add(Group group);
    public  void update(Group group);
    public void delete(long id);
}
