package ru.netology.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.netology.user_service.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
