package com.company.singleresp;

import java.io.IOException;

public class UserController {

	private Parsing parser = new Parsing();
	private UserPersistenceService persistenceService = new UserPersistenceService();

    public String createUser(String userJson) throws IOException {

        User user = parser.parseRequest(userJson);
		UserValidator validator = new UserValidator();

		boolean isValid = validator.validateUser(user);

        if(!isValid) {
            return "ERROR";
        }

		persistenceService.saveUser(user);

        return "SUCCESS";
    }
}
