/**
 * 
 */
package com.cleartrip.interview.service.interfaces;

import java.util.List;


import com.cleartrip.interview.entities.Users;

/**
 * @author manijauhari
 *
 */
public interface UserService {

	List<Users> findAll();
	Users findById(int id);
	boolean save(Users user);
	boolean delete(Users user);
	boolean deleteById(int id);
}
