package com.hmrs.hmrs.business.abstracts;

import java.util.List;

import com.hmrs.hmrs.core.utilities.results.DataResult;
import com.hmrs.hmrs.entities.concretes.EmployerUser;

public interface EmployerUserService {
	
	DataResult<List<EmployerUser>> getAllEmployers(EmployerUser employerUser);
	
}
