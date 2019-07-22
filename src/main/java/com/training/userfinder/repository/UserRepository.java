package com.training.userfinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.userfinder.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
