package chapters.introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloLogger{
	public static void main(String[] args){
		Logger logger0 = LoggerFactory.getLogger("wombat");
		Logger logger1 = LoggerFactory.getLogger("wombat");
		boolean b = logger0.equals(logger1);
		System.out.print(b+"");
	}
}