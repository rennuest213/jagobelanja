package com.jagobelanja.service;

import com.jagobelanja.entity.Role;

import java.util.List;

public interface RoleService {
    //get all role
    List<Role> getRoles();

    //get role by id
    Role getRole(int id);

    //create role
    Role createRole(Role role);

    //update role
    Role updateRole(Role role);

    //delete role
    void deleteRole(int id);
}
