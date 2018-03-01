package com.spring.service;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("Kirti") && password.equals("gupta");
	}

}
