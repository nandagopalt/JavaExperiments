package com.example.singleton;
import java.io.Serializable;

public class LoggerUtil implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Eager Initialization 
	private static volatile LoggerUtil loggerInstance; // = new LoggerUtil();
	static {
		loggerInstance = new LoggerUtil();
	}
	/*
	 * 1. Create the constructor private to make sure the class is not instantiated by the client
	 * 2. Create the static reference of the class and keep in the class scope and mark it with the volatile keyword to provide the latest/recent value when accessed by the multiple thread
	 * 3. Create static method to return the instance of the class by checking the existing reference 
	 */
	private LoggerUtil() {
		
	}
	// Lazy Initialization 
	public static LoggerUtil getInstance() {
		if(loggerInstance == null) {
			synchronized(LoggerUtil.class) {
				if(loggerInstance == null) {
					loggerInstance = new LoggerUtil();
				}
			}
		}
		return loggerInstance; 
	}
	
	void log(String message) {
		System.out.println(message);
	}
	
	private Object readResolve() {
		return loggerInstance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException();
	}

}
