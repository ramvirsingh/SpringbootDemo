/**
 * 
 */
package com.springbootdemo.business;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.springbootdemo.model.User;

/**
 * @author RAM
 *
 */
@Service
public class UserService {


	private static final Logger log = LoggerFactory.getLogger(UserService.class);

	private  List<User> listUsers=new ArrayList<User>();

	public List<User> listUsers(){
		log.info("listing User");
		return listUsers;
	}

	public User getUser(String username){
		log.info("get User {}",username);
		if(!listUsers.isEmpty()){
			return	listUsers.stream().filter(t->t.getUserName().equals(username)).findFirst().get();
		}else{
			return null;
		}

	}

	public void addUser(User user){
		log.info("add User");
		listUsers.add(user);
		log.info(" User added");
	}

	public void updateUser(String username, User user) {
		log.info("updating User");
		for(int i=0;i<listUsers.size();i++){
			User usr=listUsers.get(i);
			if(usr.getUserName().equals(username)){
				listUsers.set(i, user);
				log.info(" User updated");
				return;
			}
		}

	}

	public void deleteUser(String username) {
		log.info("deleting User");
		listUsers.removeIf(t->t.getUserName().equals(username));
		log.info(" User deleted");
	}


}
