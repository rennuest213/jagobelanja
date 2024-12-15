package com.jagobelanja.service;

import com.jagobelanja.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    //get all user
    List<User> getUsers();

    //get user by id
    User getUser(long id);

    //create user
    User addUser(User user);

    //update user
    User updateUser(User user);

    //delete user
    void deleteUser(long id);
}
