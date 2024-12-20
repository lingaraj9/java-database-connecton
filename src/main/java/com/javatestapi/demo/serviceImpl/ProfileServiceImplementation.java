package com.javatestapi.demo.serviceImpl;

import com.javatestapi.demo.dto.UserRequestDto;
import com.javatestapi.demo.service.ProfileService;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImplementation implements ProfileService {

    @Override
    public UserRequestDto getProfileUserById(UserRequestDto dto) {
        dto.setUser_name("Rabi");
        return dto;
    }
}
