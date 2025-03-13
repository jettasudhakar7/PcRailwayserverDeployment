package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.User;
import com.nt.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userrepository;

	public List<User> getAllUser() {
		return userrepository.findAll();

	}

	public User createUser(User user) {
		return userrepository.save(user);
	}

}
