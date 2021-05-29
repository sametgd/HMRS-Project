package com.hmrs.hmrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name="system_personnel_users")
@AllArgsConstructor
@NoArgsConstructor
public class SystemPersonnelUser extends User{
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
}
