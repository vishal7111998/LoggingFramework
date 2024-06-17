package Model;

public class LogMessage {
	private final long timeStamp;
	private final LogLevel logLevel;
	private final String message;
	
	public LogMessage(LogLevel level, String message) {
		timeStamp = System.currentTimeMillis();
		this.logLevel = level;
		this.message = message;
	}
	
	public long getTimeStamp() {
		return this.timeStamp;
	}
	
	public LogLevel getLogLevel() {
		return this.logLevel;
	}
	
	public String getMessage() {
		return this.message;
	}
}
