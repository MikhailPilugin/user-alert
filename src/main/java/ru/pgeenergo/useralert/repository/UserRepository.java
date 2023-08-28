package ru.pgeenergo.useralert.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pgeenergo.useralert.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
