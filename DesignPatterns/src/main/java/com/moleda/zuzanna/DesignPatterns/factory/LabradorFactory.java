package com.moleda.zuzanna.DesignPatterns.factory;

import com.moleda.zuzanna.DesignPatterns.model.Dog;
import com.moleda.zuzanna.DesignPatterns.model.Labrador;

public class LabradorFactory implements DogAbstaractfactory{
	
	private String name;
	private Integer age;
	
	public LabradorFactory(String name, Integer age) {
		this.name = name;
		this.age= age;
	}

	@Override
	public Dog getDog() {
		return new Labrador(name, age);
	}

}
