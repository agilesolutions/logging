package com.agilesolutions.logging;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.agilesolutions.logging.logic.atl;
import com.agilesolutions.logging.logic.bal;

@SpringBootApplication
public class LoggingApplication {

	@bal
	private static Logger bal;
	

	@atl
	private static Logger atl;

	public static void main(String[] args) {
		SpringApplication.run(LoggingApplication.class, args);

		String value = "something";
		
		System.getProperty("java.class.path");
		
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
