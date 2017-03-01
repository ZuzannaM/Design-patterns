package com.moleda.zuzanna.DesignPatterns.factory;

import com.moleda.zuzanna.DesignPatterns.model.Beagle;
import com.moleda.zuzanna.DesignPatterns.model.Dog;
import com.moleda.zuzanna.DesignPatterns.model.Husky;
import com.moleda.zuzanna.DesignPatterns.model.Labrador;

public class DogFactory {

	private DogFactory() {}
	
	private static DogFactory instance = null;
	
	public static DogFactory getDogFactory() {
		if(instance == null) {
			instance = new DogFactory();
			return instance;
		} else {
			return instance;
		}
	}
	
	public Dog getDog(DogAbstaractfactory factory){
		return factory.getDog();
	}
}
