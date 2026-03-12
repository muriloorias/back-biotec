package com.muriloorias.backbiotec.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muriloorias.backbiotec.models.User;

public interface UserRepo extends JpaRepository<User, Long>{
    Optional<User> findByEmailAndSenha(String email, String senha);
}
