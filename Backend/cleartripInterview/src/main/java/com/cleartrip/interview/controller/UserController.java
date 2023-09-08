/**
 * 
 */
package com.cleartrip.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cleartrip.interview.controller.interfaces.UsersOperations;
import com.cleartrip.interview.entities.Users;
import com.cleartrip.interview.service.UserServiceImpl;

/**
 * @author manijauhari
 *
 */

@RequestMapping("/users")
@RestController
@CrossOrigin
public class UserController implements UsersOperations {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Override
	public List<Users> getAll(){
		return this.userServiceImpl.findAll();
	}
	
	@Override
	public Users getUserById(@PathVariable int id) {
		return this.userServiceImpl.findById(id);
	}
	
	@Override
	public ResponseEntity<String> save(Users user) {
		if(this.userServiceImpl.save(user)) {
			return ResponseEntity.status(HttpStatus.OK).body("Saved User Successfully");
		}else {
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("Could not Save User");
		}
	}
	
	@Override
	public ResponseEntity<String> update(Users user) {
		if(this.userServiceImpl.save(user)) {
			return ResponseEntity.status(HttpStatus.OK).body("User Updated Successfully");
		}else {
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("Couldn't update user");
		}
	}
	
	@Override
	public ResponseEntity<String> deleteById(@PathVariable int id) {
		if(this.userServiceImpl.deleteById(id)) {
			return ResponseEntity.status(HttpStatus.OK).body("Deleted User Successfully");
		}else {
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("could not delete");
		}
	}
	
	@Override
	public ResponseEntity<String> delete(@RequestBody Users user) {
		if(this.userServiceImpl.delete(user)) {
			return ResponseEntity.status(HttpStatus.OK).body("Deleted User Successfully");
		}else {
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("could not delete");
		}
	}
}
