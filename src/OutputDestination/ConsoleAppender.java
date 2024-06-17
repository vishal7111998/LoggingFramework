package OutputDestination;

import Model.LogMessage;

public class ConsoleAppender implements LogAppender {

	@Override
	public void appendLog(LogMessage logMessage) {
		System.out.println("Log Level is : " + logMessage.getLogLevel());
		System.out.println("Log Messge is : "+ logMessage.getMessage());
		
	}

}
