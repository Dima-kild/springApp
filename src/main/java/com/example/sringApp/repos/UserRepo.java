package com.example.sringApp.repos;

import com.example.sringApp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User, Long> {

    User findByUsername(String username);


    User findByActivationCode(String code);

    User deleteUserById(String id);
}
