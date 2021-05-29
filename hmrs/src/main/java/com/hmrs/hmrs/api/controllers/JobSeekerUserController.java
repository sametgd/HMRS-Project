package com.hmrs.hmrs.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hmrs.hmrs.business.abstracts.JobSeekerUserService;
import com.hmrs.hmrs.core.utilities.results.DataResult;
import com.hmrs.hmrs.entities.concretes.JobSeekerUser;

@RestController
@RequestMapping("api/jobseekers")
public class JobSeekerUserController {
	
	private JobSeekerUserService jobSeekerUserService;
	
	public JobSeekerUserController(JobSeekerUserService jobSeekerUserService) {
		
		this.jobSeekerUserService = jobSeekerUserService;
		
	}
	
	@GetMapping("/getalljobseekers")
	public DataResult<List<JobSeekerUser>> getAllJobSeekers(){
		return this.jobSeekerUserService.getAllJobSeekers(null);
	}
	
}
