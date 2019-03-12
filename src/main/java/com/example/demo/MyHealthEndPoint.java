package com.example.demo;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.stereotype.Component;

//@Component
public class MyHealthEndPoint extends AbstractHealthIndicator{

	@Override
	protected void doHealthCheck(Builder builder) throws Exception {
		builder.up()
        .withDetail("app", "I am Alive")
        .withDetail("error", "No Errors so far!");
		
	}

}
