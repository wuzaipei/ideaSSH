package com.ssh.service;

import com.ssh.model.User;

public interface UserService {

    User getUser(Integer uid);

    void saveUser(User user);
}