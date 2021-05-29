package com.hmrs.hmrs.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hmrs.hmrs.business.abstracts.EmployerUserService;
import com.hmrs.hmrs.core.utilities.results.DataResult;
import com.hmrs.hmrs.entities.concretes.EmployerUser;

@RestController
@RequestMapping("api/employers")
public class EmployerUsersController {
	

	private EmployerUserService employerUserService;
	
	@Autowired
	public EmployerUsersController(EmployerUserService employerUserService) {
		super();
		this.employerUserService = employerUserService;
	}
	
	@GetMapping("getallemployers")
	public DataResult<List<EmployerUser>> getAllEmployers(){
		return this.employerUserService.getAllEmployers(null);
	}
	
}
