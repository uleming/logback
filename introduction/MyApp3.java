package chapters.introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.StatusPrinter;

public class MyApp3{
	final static Logger logger = LoggerFactory.getLogger(MyApp3.class);

	public static void main(String[] args){
		// assume SLF4J is bound to logback in current environment
		LoggerContext context = 
					(LoggerContext) LoggerFactory.getILoggerFactory();
		try{
			JoranConfigurator configurator  = new JoranConfigurator();
			configurator.setContext(context);
			// Call context.reset() to clear any previous configuration, e.g. default configuration. For multy-step configuration, omit calling context.reset().
			context.reset();
			configurator.doConfigure(args[0]);
		}catch (JoranException je){
			// StatusPrinter will handle this
		}
		StatusPrinter.printInCaseOfErrorsOrWarnings(context);
		logger.info("Entering application");

		chapters.introduction.Foo foo = new chapters.introduction.Foo();
		foo.doIt();
		logger.info("Exiting application.");
	}
}

