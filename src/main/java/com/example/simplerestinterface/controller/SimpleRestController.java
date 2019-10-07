package com.example.simplerestinterface.controller;

import javax.ws.rs.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Produces("application/json")
public class SimpleRestController {

	@Value("${healthcheck.timeout.value}")
	private long healthCheckTimeout;

	@Value("${process.timeout.value}")
	private long processTimeout;

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@GetMapping("/healthCheck")
	@ResponseBody
	@ResponseStatus(value = HttpStatus.OK)
	public void health() throws InterruptedException {
		Thread.sleep(healthCheckTimeout);
		logger.info("Health Check invoked");

	}

	@PostMapping("/process")
	@ResponseBody
	@ResponseStatus(value = HttpStatus.OK)
	public void score(@RequestBody String data) throws InterruptedException {
		logger.info("data {} ", data);
		Thread.sleep(processTimeout);
		logger.info("process invoked");
	}
}
