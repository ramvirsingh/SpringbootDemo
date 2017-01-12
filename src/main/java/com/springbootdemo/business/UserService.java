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

    private List<User> listUsers = new ArrayList<User>();

    public List<User> listUsers() {
        log.info("listing User");
        return listUsers;
    }

    public User getUser(Long id) {
        log.info("get User {}", id);
        if (!listUsers.isEmpty()) {
            return listUsers.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        } else {
            return null;
        }

    }

    public void addUser(User user) {
        log.info("add User");
        listUsers.add(user);
        log.info(" User added");
    }

    public User updateUser(Long id, User user) {
        log.info("updating User ={}", user);
        for (int i = 0; i < listUsers.size(); i++) {
            User usr = listUsers.get(i);
            if (usr.getId().equals(id)) {
                listUsers.set(i, user);
                log.info(" User updated");
            }
        }
        return user;

    }

    public void deleteUser(Long id) {
        log.info("deleting User={}", id);
        listUsers.removeIf(t -> t.getId().equals(id));
        log.info(" User deleted");
    }

}
