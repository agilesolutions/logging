package com.agilesolutions.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingApplication {

	private static final Logger bal = LoggerFactory.getLogger("bal");
	private static final Logger atl = LoggerFactory.getLogger("atl");

	public static void main(String[] args) {
		SpringApplication.run(LoggingApplication.class, args);

		String value = "something";
		
		bal.trace("doStuff needed more information - {}", value);
		bal.debug("doStuff needed to debug - {}", value);
		bal.info("doStuff took input - {}", value);
		bal.warn("doStuff needed to warn - {}", value);
		bal.error("doStuff encountered an error with value - {}", value);

		
		atl.trace("doStuff needed more information - {}", value);
		atl.debug("doStuff needed to debug - {}", value);
		atl.info("doStuff took input - {}", value);
		atl.warn("doStuff needed to warn - {}", value);
		atl.error("doStuff encountered an error with value - {}", value);

	}

}
