package com.springbootdemo.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.springbootdemo.dao.IUserDao;
import com.springbootdemo.model.User;

@Component
public class UserCreation implements ApplicationListener<ContextRefreshedEvent> {

    private IUserDao userDao;

    /**
     * @param userDao the userDao to set
     */
    @Autowired
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        User user = new User();
        user.setDepartment("IT");
        user.setFirstName("Ramvir");
        user.setLastName("Singh");
        user.setPassword("test123");
        user.setUserName("ramvirsingh");
        userDao.save(user);

    }

}
