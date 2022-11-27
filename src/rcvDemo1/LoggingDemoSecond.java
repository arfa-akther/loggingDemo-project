package rcvDemo1;
import org.apache.logging.log4j.*;



public class LoggingDemoSecond {

	private static Logger demologger= LogManager.getLogger(LoggingDemoSecond.class.getName());
	public static void main(String[] args) {
		//if we dont specify any configueration, by default log4J goes back to the default configueration(which is the  error mesages and anything above)
		demologger.info("Click successful");
		demologger.error("DB connection failed");
		demologger.trace("trace level");
		demologger.debug("This is to debug");
		demologger.info("Click successful");
		demologger.error("DB connection failed");
		demologger.trace("trace level");
		demologger.debug("This is to debug");
		demologger.info("Click successful");
		demologger.error("DB connection failed");
		
	;
		
		

	}

}
