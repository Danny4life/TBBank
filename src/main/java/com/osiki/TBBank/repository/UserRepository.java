package com.osiki.TBBank.repository;

import com.osiki.TBBank.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);
    boolean existsByAccountNumber(String accountNumber);

    User findByAccountNumber(String accountNumber);
}