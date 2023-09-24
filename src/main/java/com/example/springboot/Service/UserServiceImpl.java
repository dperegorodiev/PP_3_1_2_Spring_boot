package com.example.springboot.Service;

import com.example.springboot.dao.UserRepository;
import com.example.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;



    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    @Override
    public User readUser(Integer id) {
        return userRepository.findById(id).orElse(null);
    }


    public User updateUser(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public User createUser(User user) {
        userRepository.save(user);
        return user;
    }


    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
