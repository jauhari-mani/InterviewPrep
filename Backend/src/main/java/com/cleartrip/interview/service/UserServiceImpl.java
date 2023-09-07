/**
 * 
 */
package com.cleartrip.interview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cleartrip.interview.dao.UserDao;
import com.cleartrip.interview.entities.Users;
import com.cleartrip.interview.service.interfaces.UserService;

/**
 * @author manijauhari
 *
*/

@Service
@Component
@Repository
public class UserServiceImpl implements UserService {
	
	@Autowired(required = false)
	private UserDao userDao;

	@Override
	public List<Users> findAll() {
		return this.userDao.findAll();
	}

	@Override
	public Users findById(int id) {
		return this.userDao.findById(id).get();
	}

	@Override
	public boolean save(Users user) {
		try {
			this.userDao.save(user);
			return true;
		}catch(Exception error) {
			error.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean delete(Users user) {
		try {
			this.userDao.delete(user);
			return true;
		}catch( Exception error) {
			error.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean deleteById(int id) {
		try {
			this.userDao.deleteById(id);
			return true;
		}catch (Exception error) {
			error.printStackTrace();
		}
		return false;
	}
}
