package Client;

import LoggerService.Logger;
import Model.LogLevel;

public class LoggingFrameWorkDemo {
	
	public static void main(String[] args) {
		Logger logger = Logger.getLoggerInstance();
		
		logger.info("Hi this is my first log");
		logger.getLoggerConfig().setLogLevel(LogLevel.DEBUG);
		logger.debug("i want to debug");
	}
}
