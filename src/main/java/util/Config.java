package util;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class Config {
EnvironmentVariables envVariables= SystemEnvironmentVariables.createEnvironmentVariables();
	
	public String retrievebaseUrl(){
		
	String url=envVariables.getProperty("webdriver.base.url");
	return url;
	
	}
			
}	
	
	
	
  

