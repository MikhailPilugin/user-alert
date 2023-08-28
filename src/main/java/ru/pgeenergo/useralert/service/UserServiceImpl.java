package ru.pgeenergo.useralert.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.pgeenergo.useralert.model.User;
import ru.pgeenergo.useralert.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getById(int id) {
        Optional user = userRepository.findById(id);
        return (User) user.get();
    }

    @Override
    public User add(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user, int id) {
        User userTmp = getById(id);
        userTmp.setFirstname(user.getFirstname());
        userTmp.setLastname(user.getLastname());

        String surname = user.getSurname();

        if (surname != null) {
            userTmp.setSurname(user.getSurname());
        }

        return userRepository.save(userTmp);
    }

    @Override
    public void delete(int id) {
        userRepository.delete(getById(id));
    }
}
