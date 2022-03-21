package Runner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerHelper 
{
	private static boolean root = false;

	public static Logger getLogger(Class clas)
	{
		if (root) {
			return Logger.getLogger(clas);
		}
		PropertyConfigurator.configure(("/Exit_Test/src/resources/log4j2.properties"));
		root = true;
		return Logger.getLogger(clas);
	}
}


