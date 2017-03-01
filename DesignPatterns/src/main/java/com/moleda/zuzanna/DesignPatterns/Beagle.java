package com.moleda.zuzanna.DesignPatterns;

public class Beagle extends Dog {

	private static String breed = "beagle";
	private String name;
	private Integer age;
	
	public Beagle(String name, Integer age){
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
		return "Beagle [breed=" + breed + ", name=" + name + ", age=" + age + "]";
	}

}
