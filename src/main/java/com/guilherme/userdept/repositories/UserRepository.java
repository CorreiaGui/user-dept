package com.guilherme.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
