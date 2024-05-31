package com.example.springrediscache.domain.repository;

import com.example.springrediscache.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
