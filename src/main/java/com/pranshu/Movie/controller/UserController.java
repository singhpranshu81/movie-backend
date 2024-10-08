package com.pranshu.Movie.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

 import com.pranshu.Movie.entity.User;
import com.pranshu.Movie.service.UserService;

@RestController
@RequestMapping("/Movie/user")
@CrossOrigin(allowCredentials = "false",allowedHeaders =  "*",
origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,
		RequestMethod.PUT,RequestMethod.DELETE} )
public class UserController {
	
	
	@Autowired
	private UserService userService;
	@PostMapping("/addUser")
    public void createUser(@RequestBody User user) {
		
          userService.createUser(user);
    }
	
	
	@GetMapping("/listallusers")
	public ResponseEntity<List<User>> listAllUsers() {
		List<User> userlist = userService.getAllUser();
		return ResponseEntity.ok(userlist);
	}
	
	
	@PutMapping("/updateuser")
	public ResponseEntity<List<User>> updateUser(@RequestBody User user) {
		List<User> updatedUser = userService.updateUser(user);
		return ResponseEntity.ok(updatedUser);
	}

	@DeleteMapping("/deleteuser/{uid}")
	public ResponseEntity<String> deleteUser(@PathVariable int uid) {
		userService.deleteUser(uid);
		return ResponseEntity.ok("User " + uid + " Deleted ...");

	}
	
	@GetMapping("/finduser/{uid}")
	public ResponseEntity<Optional<User>> findUserById(@PathVariable int uid) {
		Optional<User> us = userService.getUserbyId(uid);
		return ResponseEntity.ok(us);
	}

 	@GetMapping("/finduserbyname/{name}")
	public ResponseEntity<User> getUserByName(@PathVariable String name) {
		User u = userService.getUserbyName(name);
		return ResponseEntity.ok(u);
	}
}
