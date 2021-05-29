package com.hmrs.hmrs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hmrs.hmrs.business.abstracts.JobSeekerUserService;
import com.hmrs.hmrs.core.utilities.results.DataResult;
import com.hmrs.hmrs.core.utilities.results.SuccessDataResult;
import com.hmrs.hmrs.dataAccess.abstracts.JobSeekerUserDao;
import com.hmrs.hmrs.entities.concretes.JobSeekerUser;

@Service
public class JobSeekerUserManager implements JobSeekerUserService{
	
	private JobSeekerUserDao jobSeekerUserDao;
	
	public JobSeekerUserManager(JobSeekerUserDao jobSeekerUserDao) {
		this.jobSeekerUserDao = jobSeekerUserDao;
	}

	@Override
	public DataResult<List<JobSeekerUser>> getAllJobSeekers(JobSeekerUser jobSeekerUser) {
		return new SuccessDataResult<List<JobSeekerUser>>(jobSeekerUserDao.findAll(), "Tüm İş arayanlar listelendi.");
	}
	
	
	
}
