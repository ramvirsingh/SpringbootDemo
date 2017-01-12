/**
 *
 */
package com.springbootdemo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdemo.business.UserService;
import com.springbootdemo.model.User;
import com.springbootdemo.util.RestMappings;

/**
 * @author RAM
 *
 */
@RestController
@RequestMapping(value = RestMappings.USERS)
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> listUsers() {
        return userService.listUsers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id") final Long id) {
        return userService.getUser(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public User addUser(@RequestBody User user, @PathVariable("id") final Long id) {
        return userService.updateUser(id, user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable("id") final Long id) {
        userService.deleteUser(id);
    }
}
