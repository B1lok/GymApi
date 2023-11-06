package com.example.gymapi.service;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.example.gymapi.domain.User;

import java.util.Optional;

public interface UserService {

    User createUser(User user);

    Optional<DecodedJWT> signIn(String login, String password);

    Optional<User> findByEmail(String email);

    User updateUser(User user);

}
