package com.swagger.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.swagger.example.entity.UserEntity;
import com.swagger.example.repo.UserRepo;

public class UserServiceImp implements UserService{
@Autowired	
private UserRepo repo;

	@Override
	public UserEntity saveData(UserEntity user) {
		    UserEntity user1=repo.save(user);
		return user1;
	}

	@Override
	public List<UserEntity> retrieveAll() {
		List<UserEntity> retrive=repo.findAll();
		return retrive;
	}

	@Override
	public UserEntity UpdateData(UserEntity user) {
		UserEntity reg=null;
		Optional<UserEntity> update=repo.findById(user.getUid());
		if(update.isPresent())
		{
			reg=repo.save(user);
		}
		return reg;
	}

	@Override
	public void deleteData(Integer Uid) {
		repo.deleteById(Uid);
		
	}

}

