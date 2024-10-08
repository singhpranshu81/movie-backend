package com.pranshu.Movie.service;

import java.util.List;
import java.util.Optional;

import com.pranshu.Movie.entity.User;

public interface UserService {
  public void createUser(User user);
  public List<User> updateUser(User user);
  public List<User> getAllUser();
  public List<User> deleteUser(int id);
  public Optional<User> getUserbyId(int id);
  public User getUserbyName(String name);
}
