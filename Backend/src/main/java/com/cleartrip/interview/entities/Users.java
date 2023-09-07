/**
 * 
 */
package com.cleartrip.interview.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * @author manijauhari
 *
 */

@Entity
@Table(name="users")
@NoArgsConstructor
@Getter
@Setter
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String firstName;
	private String lastName;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = false, length = 10, unique = true)
	private int phnNumber;

	public Users(String firstName, String lastName, String email, int phnNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phnNumber = phnNumber;
	}
}
