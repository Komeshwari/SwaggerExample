package com.exam.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.repo.RoleRepository;
import com.exam.repo.UserRepository;
@Service
public class UserServiceImpl implements UserService{
   @Autowired
	private UserRepository userRepo;
   @Autowired
   private RoleRepository roleRepo;
	//Creating User
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception  {
		 User local=this.userRepo.findByUsername(user.getUsername());
		 if(local!=null)
		 {
			 System.out.println("User is already there!!");
			 throw new Exception("User already present!!");
		 }
		 else
		 {
			 //create user
			 for(UserRole ur:userRoles)
			 {
			 roleRepo.save(ur.getRole());
			 }
			 user.getUserRole().addAll(userRoles);
			 local=this.userRepo.save(user);
		 }
		return local;
	}
	//getting  user  by username
	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return this.userRepo.findByUsername(username);
	}
	@Override
	public void deleteUser(Long Id) {
		this.userRepo.deleteById(Id);
		
	}

}
