package com.temple.donation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.temple.donation.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}