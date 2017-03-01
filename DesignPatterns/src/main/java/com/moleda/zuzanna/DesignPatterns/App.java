package com.moleda.zuzanna.DesignPatterns;

public class App {
	
	// SINGLETON pattern
	
	public static SingletonObject tab[] = new SingletonObject[4];
	
	public static void main(String[] args) {
		
		System.out.println("Testing a singleton pattern...");
		
		tab[0] = SingletonObject.getSingletonObject();
		tab[1] = SingletonObject.getSingletonObject();
		tab[2] = SingletonObject.getSingletonObject();
		tab[3] = SingletonObject.getSingletonObject();
		
		for(SingletonObject s : tab) {
			System.out.println(s.toString());
		}
		
	}
}
