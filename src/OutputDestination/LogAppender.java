package OutputDestination;

import Model.LogMessage;

public interface LogAppender {
	public void appendLog(LogMessage logMessage);
}
