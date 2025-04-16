package ru.netology.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.netology.userservice.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
