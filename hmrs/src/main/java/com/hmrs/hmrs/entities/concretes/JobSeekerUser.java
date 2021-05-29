package com.hmrs.hmrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_seeker_users")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerUser extends User{
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identity_number")
	private long identityNumber;
	
	@Column(name="birth_day")
	private String birthDay;
	
}
