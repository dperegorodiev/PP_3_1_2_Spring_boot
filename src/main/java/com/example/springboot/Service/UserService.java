package com.example.springboot.Service;

import com.example.springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User readUser(Integer id);

    void deleteUser(Integer id);

    User updateUser (User user);

    User createUser(User user);
}
