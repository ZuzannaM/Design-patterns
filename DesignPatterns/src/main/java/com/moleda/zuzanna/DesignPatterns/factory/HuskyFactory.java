package com.moleda.zuzanna.DesignPatterns.factory;

import com.moleda.zuzanna.DesignPatterns.model.Dog;
import com.moleda.zuzanna.DesignPatterns.model.Husky;

public class HuskyFactory implements DogAbstaractfactory{
	
	private String name;
	private Integer age;
	
	public HuskyFactory(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public Dog getDog() {
		return new Husky.HuskyBuilder(name, age)
				.setColor("black-white")
				.setWeight(5)
				.build();
	}
	
	
}
