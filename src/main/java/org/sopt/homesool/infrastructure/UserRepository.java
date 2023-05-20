package org.sopt.homesool.infrastructure;

import org.sopt.homesool.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface UserRepository extends Repository<User, Long> {
    Optional<User> findById(Long id);
}
