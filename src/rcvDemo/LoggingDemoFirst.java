package rcvDemo;
import org.apache.logging.log4j.*;



public class LoggingDemoFirst {

	private static Logger demologger= LogManager.getLogger(LoggingDemoFirst.class.getName());
	public static void main(String[] args) {
		//if we dont specify any configueration, by default log4J goes back to the default configueration(which is the  error mesages and anything above)
		demologger.info("Click successful");
		demologger.error("DB connection failed");
		demologger.debug("This is debug");
		demologger.fatal("This is fatal");
		

	}

}
