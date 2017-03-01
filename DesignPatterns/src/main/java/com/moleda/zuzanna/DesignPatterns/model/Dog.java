package com.moleda.zuzanna.DesignPatterns.model;

public abstract class Dog {

	private static String breed = "dog";
	private String name;
	private Integer age;

	public abstract String getBreed();
	public abstract String getName();
	public abstract Integer getAge();

	@Override
	public String toString() {
		return "Dog [ainmal=" + breed + ", name=" + name + ", age=" + age + "]";
	}

	
}
