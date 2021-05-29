package com.hmrs.hmrs.core.utilities.emailValidation;

import com.hmrs.hmrs.entities.concretes.User;

public interface EmailValidationService {
	
	public boolean isRealEmail(User user);
	
}
