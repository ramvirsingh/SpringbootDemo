/**
 * 
 */
package com.springbootdemo.web;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdemo.model.User;

/**
 * @author RAM
 *
 */
@RestController
public class UserController {

	@RequestMapping("/user")
	public List <User> listUsers(){
		return Arrays.asList(
				new User("RAM",20,"Noida"),
				new User("RAM",20,"Noida"),
				new User("RAM",20,"Noida"),
				new User("RAM",20,"Noida")
				);
	}

}
