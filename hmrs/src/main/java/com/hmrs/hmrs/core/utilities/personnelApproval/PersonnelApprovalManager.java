package com.hmrs.hmrs.core.utilities.personnelApproval;

import com.hmrs.hmrs.entities.concretes.User;

public class PersonnelApprovalManager implements PersonnelApprovalService{
	
	private boolean success;
	
	@Override
	public boolean success(User user) {
		
		if(success) {
			return true;
		}else {
			return false;
		}
		
	}

}
