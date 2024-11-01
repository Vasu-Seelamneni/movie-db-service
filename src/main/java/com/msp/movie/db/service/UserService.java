package com.msp.movie.db.service;

import com.msp.movie.db.model.User;

import java.util.List;

public interface UserService {

    User save(User user);

    User findById(Long userId);

    void delete(Long userId);

    List<User> findAll();
}
