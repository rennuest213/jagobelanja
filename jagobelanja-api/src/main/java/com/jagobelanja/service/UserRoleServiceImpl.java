package com.jagobelanja.service;

import com.jagobelanja.entity.UserRole;
import com.jagobelanja.repository.UserRoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    //dependency injection
    private final UserRoleRepository userRoleRepository;

    public UserRoleServiceImpl(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }


    @Override
    public List<UserRole> getUserRoles() {
        return userRoleRepository.findAll();
    }

    @Override
    public UserRole getUserRole(int id) {
        return userRoleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public UserRole saveUserRole(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

    @Override
    public UserRole updateUserRole(UserRole userRole) {
        if (!userRoleRepository.existsById(userRole.getId())) {
            throw new RuntimeException("User not found");
        }
        return userRoleRepository.save(userRole);
    }

    @Override
    public void deleteUserRole(int id) {
        userRoleRepository.deleteById(id);
    }
}
