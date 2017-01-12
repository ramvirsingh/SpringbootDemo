/**
 *
 */
package com.springbootdemo.service.impl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.springbootdemo.common.service.AbstractService;
import com.springbootdemo.model.User;
import com.springbootdemo.service.UserServiceIFace;

/**
 * @author RAM
 *
 */
public class UserServiceImpl extends AbstractService<User> implements UserServiceIFace {

    @Override
    public User findOne(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<User> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User create(User resource) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void update(User resource) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub

    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public User findOneByName(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected PagingAndSortingRepository<User, Long> getDao() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected JpaSpecificationExecutor<User> getSpecificationExecutor() {
        // TODO Auto-generated method stub
        return null;
    }

}
