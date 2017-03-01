package com.moleda.zuzanna.DesignPatterns;

public class App {
	
	// FACTORY pattern
	public static Dog dogs[] = new Dog[3];
	
	public static void main(String[] args) {
		
		System.out.println("Testing a factory pattern...");
		
		dogs[0] = DogFactory.getDogFactory().getDog("husky", "Leo", 2);
		dogs[1] = DogFactory.getDogFactory().getDog("labrador", "Max", 1);
		dogs[2] = DogFactory.getDogFactory().getDog("beagle", "Rex", 3);
		
		for(Dog dog : dogs) {
			System.out.println(dog);
		}
		
	}
}
