/**
 * 
 */
package com.cleartrip.interview.controller.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cleartrip.interview.entities.Users;

/**
 * @author manijauhari
 *
 */
@RequestMapping("/deafult")
public interface UsersOperations {

	@GetMapping("/All")
	public List<Users> getAll();
	
	@GetMapping("/{id}")
	public Users getUserById(@PathVariable int id);
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Users user);
	
	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody Users user);
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> delete(@RequestBody Users user);
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id);
}
