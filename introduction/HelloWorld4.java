package chapters.introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld4{
	final static Logger logger = LoggerFactory.getLogger(HelloWorld4.class);
	
	public static void main(String[] args){
		logger.info("Entering application.");

		Foo foo = new Foo();
		foo.doIt();
		logger.info("Exiting application.");
	}
}