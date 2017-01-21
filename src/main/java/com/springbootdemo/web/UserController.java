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

import com.springbootdemo.service.IUserService;
import com.springbootdemo.web.dto.UserDTO;

/**
 * @author RAM
 *
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/user")
    public List<UserDTO> listUsers() {
        return userService.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user/{id}")
    public UserDTO getUser(@PathVariable Long id) {
        return userService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user/name/{userName}")
    public List<UserDTO> getUserByUserName(@PathVariable String userName) {
        return userService.findByName(userName);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody UserDTO userDTO) {
        userService.save(userDTO);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/user/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateUser(@RequestBody UserDTO userDTO, @PathVariable Long id) {
        userService.update(id, userDTO);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/user/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.delete(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/user")
    public void deleteAll() {
        userService.deleteAll();

    }
}
