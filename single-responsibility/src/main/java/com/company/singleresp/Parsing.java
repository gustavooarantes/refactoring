package com.company.singleresp;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Parsing {

	public User parseRequest(String userJson) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(userJson, User.class);
	}
}
