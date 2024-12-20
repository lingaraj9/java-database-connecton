package com.javatestapi.demo.service;

import com.javatestapi.demo.dto.UserRequestDto;

public interface ProfileService {
    UserRequestDto getProfileUserById(UserRequestDto dto);
}
