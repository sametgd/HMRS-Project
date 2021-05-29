package com.hmrs.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmrs.hmrs.business.abstracts.JobPositionService;
import com.hmrs.hmrs.core.utilities.results.DataResult;
import com.hmrs.hmrs.core.utilities.results.SuccessDataResult;
import com.hmrs.hmrs.dataAccess.abstracts.JobPositionDao;
import com.hmrs.hmrs.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
		
	}

	@Override
	public DataResult<List<JobPosition>> getAllPositions(JobPosition jobPosition) {
		return new SuccessDataResult<List<JobPosition>>(jobPositionDao.findAll(), "Tüm iş pozisyonları listelendi.");
	}
	
}
