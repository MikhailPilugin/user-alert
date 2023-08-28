package ru.pgeenergo.useralert.service;

import ru.pgeenergo.useralert.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getById(int id);
    User add(User user);
    User update(User user, int id);
    void delete(int id);
}
