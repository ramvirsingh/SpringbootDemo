/**
 *
 */
package com.springbootdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.springbootdemo.common.ByNameApiIFace;
import com.springbootdemo.model.User;

/**
 * @author RAM
 *
 */
public interface UserDaoIFace extends JpaRepository<User, Long>, JpaSpecificationExecutor<User>, ByNameApiIFace<User> {

}
