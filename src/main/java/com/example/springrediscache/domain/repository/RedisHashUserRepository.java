package com.example.springrediscache.domain.repository;

import com.example.springrediscache.domain.entity.RedisHashUser;
import org.springframework.data.repository.CrudRepository;

public interface RedisHashUserRepository extends CrudRepository<RedisHashUser, Long> {
}
