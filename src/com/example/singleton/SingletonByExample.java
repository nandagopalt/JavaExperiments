package com.example.singleton;
import java.io.Serializable;

public class SingletonByExample implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Eager Initialization
	// When the class get loaded
	private static volatile SingletonByExample singletonInstance; // = new SingletonByExample();
	// When the class get loaded and to be used when atleast one time the class is
	// used
	static {
		singletonInstance = new SingletonByExample();
	}
	/*
	 * 1. Make the constructor private so that no client can instantiate the class /
	 * create the object of the class 
	 * 2. Create the instance of the class with the
	 * static reference/keyword in the class scope 
	 * 3. Create a static method i.e.,
	 * getInstance() to check and return instance of the class
	 *
	 */

	private SingletonByExample() {

	}

	// Lazy Initialization
	public static SingletonByExample getInstance() {
		if (singletonInstance == null) {
			synchronized (SingletonByExample.class) {
				if (singletonInstance == null) {
					singletonInstance = new SingletonByExample();
				}
			}
		}
		return singletonInstance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException();
	}
	
	private Object readResolve() {
		return singletonInstance;
	}

}
