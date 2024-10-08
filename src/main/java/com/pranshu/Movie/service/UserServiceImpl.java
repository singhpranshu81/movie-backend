package com.pranshu.Movie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pranshu.Movie.entity.User;
import com.pranshu.Movie.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	@Override
	public void createUser(User user) {
		userRepository.save(user);
	}

	@Override
	public List<User> updateUser(User user) {
		userRepository.save(user);
		return getAllUser();
	}

	@Override
	public List<User> getAllUser() {
			
		return userRepository.findAll();
	}

	@Override
	public List<User> deleteUser(int id) {
		// TODO Auto-generated method stub
	userRepository.deleteById(id);
	return getAllUser();
	}

	@Override
	public Optional<User> getUserbyId(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public User getUserbyName(String name) {
		// TODO Auto-generated method stub
		return userRepository.findbyName(name);
	}

}
