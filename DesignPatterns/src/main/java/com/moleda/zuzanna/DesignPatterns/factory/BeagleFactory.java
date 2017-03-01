package com.moleda.zuzanna.DesignPatterns.factory;

import com.moleda.zuzanna.DesignPatterns.model.Beagle;
import com.moleda.zuzanna.DesignPatterns.model.Dog;

public class BeagleFactory implements DogAbstaractfactory{
	
	private String name;
	private Integer age;
	
	public BeagleFactory(String name, Integer age) {
		this.name = name;
		this.age= age;
	}

	@Override
	public Dog getDog() {
		return new Beagle(name, age);
	}

}
