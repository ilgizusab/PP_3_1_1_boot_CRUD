package ru.kata.pp_3_1_1_boot_crud.repository;

import org.springframework.data.repository.CrudRepository;

import ru.kata.pp_3_1_1_boot_crud.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}