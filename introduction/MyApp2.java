package chapters.introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;


public class MyApp2{
	final static Logger logger = LoggerFactory.getLogger(HelloWorld4.class);
	
	public static void main(String[] args){
		// assume SLF4J is bound to logback in the current environment
		LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
		// print logback's internal status
		StatusPrinter.print(lc);


		logger.info("Entering application.");

		Foo foo = new Foo();
		foo.doIt();
		logger.info("Exiting application.");
	}
}