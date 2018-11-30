package org.lanqiao;

import java.util.List;

public interface IUserDao {
    public void addUser(User user);
    public List<User> getUserList();
}
