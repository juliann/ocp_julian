package loggingStuff;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
public static void main(String[] args) {
	
	 Logger logger = LoggerFactory.getLogger("com.baeldung.logback");
	    logger.info("Hello {} World ", 6);
}
}
