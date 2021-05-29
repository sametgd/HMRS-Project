package com.hmrs.hmrs.business.abstracts;

import java.util.List;

import com.hmrs.hmrs.core.utilities.results.DataResult;
import com.hmrs.hmrs.entities.concretes.JobPosition;

public interface JobPositionService {
	
	DataResult<List<JobPosition>> getAllPositions(JobPosition jobPosition);
	
}
