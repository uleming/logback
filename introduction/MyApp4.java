package chapters.introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.StatusPrinter;

public class MyApp4{

	private static Logger logger = LoggerFactory.getLogger(MyApp4.class);

	public static void main(String[] args){

		LoggerContext context = 
					(LoggerContext)LoggerFactory.getILoggerFactory();

		try{
			JoranConfigurator configurator = new JoranConfigurator();
			configurator.setContext(context);
			context.reset();
			configurator.doConfigure(args[0]);
		} catch (JoranException je){

		}
		StatusPrinter.printInCaseOfErrorsOrWarnings(context);
		logger.info("Entering application");
		Foo foo = new Foo();
		foo.doIt();
		logger.info("Exiting application");
	}
}