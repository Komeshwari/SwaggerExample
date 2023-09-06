package com.swagger.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swagger.example.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity,Integer> {

}
