package com.jagobelanja.service;


import com.jagobelanja.entity.UserRole;

import java.util.List;

public interface UserRoleService {
    //get all user role
    List<UserRole> getUserRoles();

    //get user role by id
    UserRole getUserRole(int id);

    //create user role
    UserRole saveUserRole(UserRole userRole);

    //update user role
    UserRole updateUserRole(UserRole userRole);

    //delete user role
    void deleteUserRole(int id);
}
