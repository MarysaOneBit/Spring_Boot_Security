package com.serdtsev.spring.boot.springbootproject.service;

import com.serdtsev.spring.boot.springbootproject.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUserById(int id);

    void deleteUser(int id);

    void updateUser(User user);

    User findUserByUsername(String username);
}
