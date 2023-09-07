/**
 * 
 */
package com.cleartrip.interview.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cleartrip.interview.entities.Users;

/**
 * @author manijauhari
 *
 */
@Service
public interface UserService {

	List<Users> findAll();
	Users findById(int id);
	boolean save(Users user);
	boolean delete(Users user);
	boolean deleteById(int id);
}
