package com.moleda.zuzanna.DesignPatterns;

public class SingletonObject {

	// private constructor
	private SingletonObject() {
		System.out.println("SingletonObject constrictor triggered.");
	}
	
	// private static variable of a class
	private static SingletonObject instance = null;
	
	// public static method
	public static SingletonObject getSingletonObject() {
		if(instance == null) {
			instance = new SingletonObject();
			return instance;
		} else {
			return instance;
		}
	}
	
	
	
}
