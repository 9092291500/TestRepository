package automation_Practice;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

/*public class FirstLog {
	static Logger log = Logger.getLogger(FirstLog.class);
	public static void main(String[] args) {
		//PropertiesConfigurator is used to configure logger from properties file
        PropertyConfigurator.configure("C:\\log4j.properties");

        //log the message to file
        log.trace("This is a debug message");
        log.info("This is an info message");
	}
}*/

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class FirstLog {
	static Logger log = Logger.getLogger(FirstLog.class);
	public static void main(String[] args) {
		//PropertiesConfigurator is used to configure logger from properties file
				//PropertyConfigurator.configure("C:\\log4j.properties");

	DOMConfigurator.configure("log4j.xml");
		 
				//log the message to file
		
				log.trace("This is a debug message");
				log.info("This is an info message");
				
				log.info("SSSSS");
				
				System.out.println("sdsd");
	}
}