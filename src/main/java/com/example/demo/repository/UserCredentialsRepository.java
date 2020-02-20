package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.UserCredentials;

public interface UserCredentialsRepository extends JpaRepository<UserCredentials, Long> {

	UserCredentials findByPrimaryEmail(String email);

}
