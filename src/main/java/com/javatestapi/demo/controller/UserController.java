package com.javatestapi.demo.controller;

import com.javatestapi.demo.dto.UserRequestDto;
import com.javatestapi.demo.service.ProfileService;
import com.javatestapi.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/usercontroller")//unique name for this controller->class level annotation
public class UserController {

    @Autowired //dependancy iject...
    UserService userService;

    @Autowired
    ProfileService profileService;


    @PostMapping("/save")
    public ResponseEntity<String> postUser1(@RequestBody UserRequestDto dto){
        //        ResponseEntity : This will change the repose to json
        userService.saveUser(dto);
        return new ResponseEntity<>("Created sucess", HttpStatus.CREATED);
    }

//    @GetMapping
//    public ArrayList<Integer> getUser(){
//        ArrayList<Integer> list= new ArrayList<>();
//        list.add(1);
//        return list;
//    }
//    @GetMapping("/get-user") //to make it unique else we will get Ambiguous Mapping error
//    public String getUser1(){
//        return "1Lingaraj";
//    }
//    //DTO : data transfer object client-> server or server -> server or class-> class
//    @PostMapping("/saveuser")
//    public UserRequestDto postUser(@RequestBody UserRequestDto dto){
//        return dto;
//    }
//
//    @PostMapping("/save")
//    public ResponseEntity<UserRequestDto> postUser1(@RequestBody UserRequestDto dto){
//        //        ResponseEntity : This will change the repose to json
//        return new ResponseEntity<>(dto, HttpStatus.CREATED);
//    }
//
//    @GetMapping("/get-user/{id}") //to make it unique else we will get Ambiguous Mapping error
//    public ResponseEntity<String> getUser2(@PathVariable("id") String id){
//    //return userService.getUserById(id);
//        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.CREATED);
//    }
//
//    @PostMapping("/getprofile")
//    public UserRequestDto getProfileById(@RequestBody UserRequestDto dto){
//        return profileService.getProfileUserById(dto);
//    }

}
