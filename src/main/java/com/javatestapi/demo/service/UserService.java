package com.javatestapi.demo.service;

import com.javatestapi.demo.dto.UserRequestDto;

public interface UserService {
    String getUserById(String id);

    void saveUser(UserRequestDto dto);
}
