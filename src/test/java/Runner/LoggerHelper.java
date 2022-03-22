package Runner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerHelper {

	public Logger log;

	public LoggerHelper(String name) {
		log = LogManager.getLogger(name);
		BasicConfigurator.configure();

		PropertyConfigurator.configure("./src/test/resources/log4j2.properties");
	}
}
