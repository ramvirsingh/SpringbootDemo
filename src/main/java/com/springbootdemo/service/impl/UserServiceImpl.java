/**
 *
 */
package com.springbootdemo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.springbootdemo.dao.IUserDao;
import com.springbootdemo.exception.RestPreconditions;
import com.springbootdemo.model.User;
import com.springbootdemo.service.IUserService;
import com.springbootdemo.web.dto.UserDTO;

/**
 * @author RAM
 *
 */
@Service
public class UserServiceImpl implements IUserService {

    // private static final Logger log =
    // LoggerFactory.getLogger(UserServiceImpl.class);

    private IUserDao userDao;

    /**
     * @param userDao
     *            the userDao to set
     */
    @Autowired
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserDTO findById(Long id) {
        User user = userDao.findOne(id);
        return new UserDTO(user);
    }

    @Override
    public List<UserDTO> findAll() {
        List<User> users = userDao.findAll();
        List<UserDTO> userDtos = users.stream().map(this::convert).collect(Collectors.toList());
        return Lists.newArrayList(userDtos);
    }

    @Override
    public void delete(Long id) {
        userDao.delete(id);

    }

    @Override
    public void deleteAll() {
        userDao.deleteAll();

    }

    @Override
    public UserDTO save(UserDTO userDTO) {
        RestPreconditions.checkRequestElementNotNull(userDTO);
        User user = new User(userDTO);
        if (userDao.findAll(Example.of(user)) == null) {
            userDao.save(user);
            userDTO.setId(user.getId());
            return userDTO;
        } else {
            return null;
        }
    }

    @Override
    public UserDTO update(Long id, UserDTO userDTO) {
        RestPreconditions.checkRequestElementNotNull(userDTO);
        RestPreconditions.checkRequestElementNotNull(userDTO.getId());
        RestPreconditions.checkIfBadFRequest(userDTO.getId() == id, userDTO.getClass().getSimpleName() + " id and uri id don't match");
        User user = RestPreconditions.checkNotNull(userDao.findOne(userDTO.getId()));

        user.setDepartment(userDTO.getDepartment());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setPassword(userDTO.getPassword());
        userDao.save(user);
        return userDTO;
    }

    private final UserDTO convert(final User user) {
        return new UserDTO(user);
    }

    @Override
    public List<UserDTO> findByName(String name) {
        User user = new User();
        user.setUserName(name);
        List<User> users = userDao.findAll(Example.of(user));
        List<UserDTO> userDtos = users.stream().map(this::convert).collect(Collectors.toList());
        return Lists.newArrayList(userDtos);

    }
}
