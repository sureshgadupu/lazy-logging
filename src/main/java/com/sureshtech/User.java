package com.sureshtech;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class User {
	
	private static final Logger logger = LogManager.getLogger();
	
	private Integer id;
	private String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		logger.info("getName is called");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
