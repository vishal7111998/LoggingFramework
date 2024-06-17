package LoggerService;

import Exception.LoggerLevelException;
import Model.LogLevel;
import Model.LogMessage;
import Model.LoggerConfig;
import OutputDestination.ConsoleAppender;

public class Logger {
	private static Logger logger = null;
	private LoggerConfig loggerConfig;
	
	private Logger() {
		loggerConfig = new LoggerConfig(LogLevel.INFO, new ConsoleAppender());
	}
	
	public static Logger getLoggerInstance() {
		if(logger == null) {
			synchronized(Logger.class) {
				if(logger == null) {
					logger = new Logger();
				}
			}
		}
		return logger;
	}
	
	public void log(LogLevel logLevel, String message) {
		if(logLevel.ordinal() >= loggerConfig.getLogLevel().ordinal()) {
			LogMessage logMessage = new LogMessage(logLevel, message);
			loggerConfig.getLogAppender().appendLog(logMessage);
		}
		else {
			throw new LoggerLevelException();
		}
	}
	
	public void debug(String message) {
		log(LogLevel.DEBUG, message);
	}
	
	public void info(String message) {
		log(LogLevel.INFO, message);
	}
	
	public void warning(String message) {
		log(LogLevel.WARNING, message);
	}
	
	public void error(String message) {
		log(LogLevel.ERROR, message);
	}
	
	public void fatal(String message) {
		log(LogLevel.FATAL, message);
	}

	public LoggerConfig getLoggerConfig() {
		return loggerConfig;
	}

	public void setLoggerConfig(LoggerConfig loggerConfig) {
		this.loggerConfig = loggerConfig;
	}
	
	
}
