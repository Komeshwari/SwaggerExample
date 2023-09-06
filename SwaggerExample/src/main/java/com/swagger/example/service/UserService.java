package com.swagger.example.service;

import java.util.List;

import com.swagger.example.entity.UserEntity;


public interface UserService {
 UserEntity saveData(UserEntity user);
 List<UserEntity> retrieveAll();
 UserEntity UpdateData(UserEntity user);
 public void deleteData(Integer Uid);
 
}
