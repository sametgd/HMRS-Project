package com.hmrs.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmrs.hmrs.business.abstracts.EmployerUserService;
import com.hmrs.hmrs.core.utilities.results.DataResult;
import com.hmrs.hmrs.core.utilities.results.SuccessDataResult;
import com.hmrs.hmrs.dataAccess.abstracts.EmployerUserDao;
import com.hmrs.hmrs.entities.concretes.EmployerUser;

@Service
public class EmployerUserManager implements EmployerUserService{
	
	private EmployerUserDao employerUserDao;
	
	@Autowired
	public EmployerUserManager(EmployerUserDao employerUserDao) {
		
		this.employerUserDao = employerUserDao;
		
	}

	@Override
	public DataResult<List<EmployerUser>> getAllEmployers(EmployerUser employerUser) {
		return new SuccessDataResult<List<EmployerUser>>(employerUserDao.findAll(), "Tüm işverenler listelendi");
	}

}
