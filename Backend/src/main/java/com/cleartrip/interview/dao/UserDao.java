/**
 * 
 */
package com.cleartrip.interview.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cleartrip.interview.entities.Users;

/**
 * @author manijauhari
 *
 */
@Repository
@Component
public interface UserDao extends JpaRepository<Users,Integer>{

}
