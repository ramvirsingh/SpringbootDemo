/**
 *
 */
package com.springbootdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootdemo.model.User;

/**
 * @author RamS
 *
 */
public interface IUserDao extends JpaRepository<User, Long> {

}
