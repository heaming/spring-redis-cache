package com.example.springrediscache.controller;

import com.example.springrediscache.domain.entity.RedisHashUser;
import com.example.springrediscache.domain.entity.User;
import com.example.springrediscache.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("users/{id}")
    public User getUser(@PathVariable Long id) {

//        return userService.getUser(id);
        return userService.getUserBySpringCache(id);
    }

    @GetMapping("redishash-users/{id}")
    public RedisHashUser getUserByRedisHash(@PathVariable Long id) {
        return userService.getUserByRedisHash(id);
    }


}
