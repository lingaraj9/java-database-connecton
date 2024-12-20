package com.javatestapi.demo.serviceImpl;

import com.javatestapi.demo.dto.UserRequestDto;
import com.javatestapi.demo.entity.UserEntity;
import com.javatestapi.demo.repository.UserRepository;
import com.javatestapi.demo.service.UserService;
import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository rserRepository;

    @Override
    public String getUserById(String id) {
return id;
    }

    @Override
    public void saveUser(UserRequestDto dto) {
    validation(dto);
        UserEntity userEntity=new UserEntity();

        userEntity.setUser_name(dto.getUser_name());
        userEntity.setPassword(dto.getPassword());

        rserRepository.save(userEntity);
    }

    private void validation(UserRequestDto dto) {

        if(dto!=null){
            if(dto.getUser_name()==null || dto.getUser_name().isEmpty()){
                throw new HttpServerErrorException(HttpStatus.NOT_FOUND, "Username not found");
            }

            if(dto.getPassword()==null || dto.getPassword().isEmpty()){
                throw new HttpServerErrorException(HttpStatus.NOT_FOUND, "Password not found");
            }
        }else{
            throw new HttpServerErrorException(HttpStatus.NOT_FOUND, "RequestBody not found");
        }
    }
}
