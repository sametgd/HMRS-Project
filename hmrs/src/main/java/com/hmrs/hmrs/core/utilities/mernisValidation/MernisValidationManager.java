package com.hmrs.hmrs.core.utilities.mernisValidation;

import com.hmrs.hmrs.entities.concretes.User;

public class MernisValidationManager implements MernisValidationService {

	private boolean realPerson;

	@Override
	public boolean isRealPerson(User user) {
		if (realPerson) {
			return true;
		} else {
			return false;
		}

	}

}
