package com.sureshtech;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger logger = LogManager.getLogger("lazy-logger");
	
	
    public static void main( String[] args )
    { 
    	User user = new User();
    	
    	user.setId(1);    	
    	user.setName("Test");   	
    	
    	
    	logger.debug("Welcome to {}!",  user.getName() );
    	
    	logger.info("Welcome to {}!", user.getName() );
    	
    	logger.debug("Welcome to {}!", () -> user.getName() );
    	
    	logger.info("Welcome to {}!",() -> user.getName() );
       
    }
}
