package alpha;
import org.apache.logging.log4j.*;

public class Demo {

	
	
	private static Logger log= LogManager.getLogger(Demo.class.getName());
	
	public static void main(String[] args) {
		
		log.debug("I have cliecked on button");
		
			log.info("button is displayed");
		log.error("button is not displayed");
		
		log.fatal("button is missing");
	
		
	}

}
