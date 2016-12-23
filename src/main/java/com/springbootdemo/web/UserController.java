/**
 * 
 */
package com.springbootdemo.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdemo.business.UserService;
import com.springbootdemo.model.User;

/**
 * @author RAM
 *
 */
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/users")
	public List <User> listUsers(){
		return userService.listUsers();
	}

	@RequestMapping("/users/{username}")
	public User getUser(@PathVariable String username){
		return userService.getUser(username);
	}

	@RequestMapping(method=RequestMethod.POST, value="/users")
	public void addUser(@RequestBody User user){
		userService.addUser(user);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/users/{username}")
	public void addUser(@RequestBody User user,@PathVariable String username){
		userService.updateUser(username,user);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/users/{username}")
	public void deleteUser(@PathVariable String username){
		 userService.deleteUser(username);
	}
}
