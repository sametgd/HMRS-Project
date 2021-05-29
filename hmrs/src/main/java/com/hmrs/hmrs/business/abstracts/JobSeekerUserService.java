package com.hmrs.hmrs.business.abstracts;

import java.util.List;

import com.hmrs.hmrs.core.utilities.results.DataResult;
import com.hmrs.hmrs.entities.concretes.JobSeekerUser;

public interface JobSeekerUserService {
	
	DataResult<List<JobSeekerUser>> getAllJobSeekers(JobSeekerUser jobSeekerUser);
	
}
