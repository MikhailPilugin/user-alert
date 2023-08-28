package ru.pgeenergo.useralert.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.pgeenergo.useralert.model.User;
import ru.pgeenergo.useralert.service.UserServiceImpl;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
@RequiredArgsConstructor
public class UserController {
    private final UserServiceImpl userService;

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable int id) {
        return userService.getById(id);
    }

    @PostMapping
    public User add(@RequestBody User user) {
        return userService.add(user);
    }

    @PatchMapping("/{id}")
    public User update(@RequestBody User user, @PathVariable int id) {
        return userService.update(user, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        userService.delete(id);
    }
}
