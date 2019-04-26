package com.ssh.dao;

import com.ssh.model.User;

public interface UserDao {

    User getUser(Integer uid);

    void saveUser(User user);
}