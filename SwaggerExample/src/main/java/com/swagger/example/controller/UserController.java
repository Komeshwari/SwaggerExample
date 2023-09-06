package com.swagger.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.example.entity.UserEntity;
import com.swagger.example.service.UserServiceImp;

@RestController
public class UserController {
@Autowired
private UserServiceImp service;


@PostMapping
public UserEntity RegisterData(@RequestBody UserEntity user)
{
	 UserEntity register=service.saveData(user);
	return register;
}

@GetMapping
public List<UserEntity> retrieveData(){
	    List<UserEntity> retrive=service.retrieveAll();
	    return retrive;
}
@PutMapping
public UserEntity UpdateData(UserEntity user)
{
	UserEntity updateData=service.UpdateData(user);
	return updateData;
}
}

