package com.hmrs.hmrs.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hmrs.hmrs.business.abstracts.JobPositionService;
import com.hmrs.hmrs.core.utilities.results.DataResult;
import com.hmrs.hmrs.entities.concretes.JobPosition;

@RestController
@RequestMapping("api/jobpositions")
public class PositionsController {
	
	private JobPositionService jobPositionService;
	
	@Autowired
	public PositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}



	@GetMapping("/getalljobpositions")
	public DataResult<List<JobPosition>> getAllJobPositions(){
		
		return this.jobPositionService.getAllPositions(null);
	
	}
	

	
	
}
