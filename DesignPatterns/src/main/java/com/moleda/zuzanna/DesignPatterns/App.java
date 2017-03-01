package com.moleda.zuzanna.DesignPatterns;

import com.moleda.zuzanna.DesignPatterns.factory.BeagleFactory;
import com.moleda.zuzanna.DesignPatterns.factory.DogFactory;
import com.moleda.zuzanna.DesignPatterns.factory.HuskyFactory;
import com.moleda.zuzanna.DesignPatterns.factory.LabradorFactory;
import com.moleda.zuzanna.DesignPatterns.model.Dog;

public class App {
	
	// ABSTRACT FACTORY pattern
	public static Dog dogs[] = new Dog[3];
	
	public static void main(String[] args) {
		
		System.out.println("Testing a factory pattern...");
		
		dogs[0] = DogFactory.getDogFactory().getDog(new HuskyFactory("Leo", 2));
		dogs[1] = DogFactory.getDogFactory().getDog(new LabradorFactory("Leo", 2));
		dogs[2] = DogFactory.getDogFactory().getDog(new BeagleFactory("Leo", 2));
		
		for(Dog dog : dogs) {
			System.out.println(dog);
		}
		
	}
}
