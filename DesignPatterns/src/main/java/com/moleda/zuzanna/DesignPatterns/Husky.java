package com.moleda.zuzanna.DesignPatterns;

public class Husky extends Dog {

	private static String breed = "husky";
	private String name;
	private Integer age;
	
	public Husky(String name, Integer age){
		this.name = name;
		this.age = age;
	}
	

	@Override
	public String getBreed() {
		return breed;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Integer getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Husky [breed=" + breed + ", name=" + name + ", age=" + age + "]";
	}
	
}
