package ru.kata.pp_3_1_1_boot_crud.service;

import org.springframework.stereotype.Service;
import ru.kata.pp_3_1_1_boot_crud.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Integer id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Integer id);
}
