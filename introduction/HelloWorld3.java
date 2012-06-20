package chapters.introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld3{
	public static void main(String[] args){
		Logger logger = LoggerFactory.getLogger("wombat");
		String message = "message";
		logger.debug("This is new {}",message);
	}
}