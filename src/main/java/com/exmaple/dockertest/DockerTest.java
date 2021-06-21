package com.exmaple.dockertest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerTest {
	
	@GetMapping
	String getMessage() {
		return "Testing Docker container with Plugin";
	}

}
