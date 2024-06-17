package Model;

import OutputDestination.LogAppender;

public class LoggerConfig {
	private LogLevel logLevel;
	private LogAppender logAppender;
	
	public LoggerConfig(LogLevel level, LogAppender logAppender) {
		this.logAppender = logAppender;
		this.logLevel = level;
	}

	public LogLevel getLogLevel() {
		return logLevel;
	}

	public void setLogLevel(LogLevel logLevel) {
		this.logLevel = logLevel;
	}

	public LogAppender getLogAppender() {
		return logAppender;
	}

	public void setLogAppender(LogAppender logAppender) {
		this.logAppender = logAppender;
	}
	
	
}
