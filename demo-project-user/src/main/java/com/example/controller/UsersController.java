package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private Environment env;

	@GetMapping("/status/check")
	public String status()
	{
		return "Working on port " + env.getProperty("local.server.port");
	}
	@GetMapping("/status/demo")
	public String statusDemo()
	{
		return "Working on port  and demo controller" + env.getProperty("local.server.port");
	}

}
