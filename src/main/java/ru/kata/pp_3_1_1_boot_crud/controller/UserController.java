package ru.kata.pp_3_1_1_boot_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kata.pp_3_1_1_boot_crud.model.User;
import ru.kata.pp_3_1_1_boot_crud.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("user", new User());
        return "userForm";
    }

    @PostMapping("/new")
    public String createUser(@ModelAttribute User user) {
        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        User user = userService.getUserById(id);
        if (user != null) {
            model.addAttribute("user", user);
            return "userForm";
        } else {
            return "redirect:/users";
        }
    }

    @PostMapping("/edit/{id}")
    public String updateUser(@PathVariable Integer id, @ModelAttribute User user) {
        user.setId(id);
        userService.updateUser(user);
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }
}