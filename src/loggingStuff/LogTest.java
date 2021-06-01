package loggingStuff;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
	static { System.setProperty("logback.configurationFile", "./logback.xml");}
public static void main(String[] args) {
	
    Logger logger = LoggerFactory.getLogger(LogTest.class);
    Logger fileLogger = LoggerFactory.getLogger("com.baeldung.logback.tests");
    logger.info("Hello {} World ", 6);
    logger.warn("AAAAAAAAAH");
    fileLogger.warn("AH");
}
}
