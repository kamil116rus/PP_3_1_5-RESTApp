package ru.kata.spring.boot_security.demo.service;
import ru.kata.spring.boot_security.demo.entityes.Role;


import java.util.List;

public interface RoleService {
    void addRole(Role role);

    List<Role> getAllRoles();
}
