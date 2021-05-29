package com.hmrs.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hmrs.hmrs.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
	
	
}
