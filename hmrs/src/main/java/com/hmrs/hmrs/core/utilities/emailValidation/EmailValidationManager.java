package com.hmrs.hmrs.core.utilities.emailValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.hmrs.hmrs.entities.concretes.User;

public class EmailValidationManager implements EmailValidationService {

	private final Pattern validEmailAddressRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	private boolean validateEmail(String email) {
		Matcher matcher = validEmailAddressRegex.matcher(email);
		return matcher.find();
	}

	@Override
	public boolean isRealEmail(User user) {

		if (validateEmail(user.getEmail())) {
			System.out.println("E-Mail Doğrulaması Başarılı.");
			return true;
		} else {
			System.out.println("E-Mail Doğrulaması Başarısız.");
			return false;
		}

	}

}
