package com.moleda.zuzanna.DesignPatterns.model;

public class Husky extends Dog {

	private static String breed = "husky";
	
	// required params
	private String name;
	private Integer age;
	
	// optional params
	private String color;
	private Integer weight;
	
	
	private Husky(HuskyBuilder huskyBuilder){
		this.name = huskyBuilder.name;
		this.age = huskyBuilder.age;
		this.color = huskyBuilder.color;
		this.weight = huskyBuilder.weight;
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
		return "HuskyBuilder [breed=" + breed + ", name=" + name + ", age=" + age + ", color=" + color + ", weight=" + weight + "]";
	}
	
	public static class HuskyBuilder {
		

		// required params
		private String name;
		private Integer age;
		
		// optional params
		private String color;
		private Integer weight;
		
		public HuskyBuilder(String name, Integer age) {
			this.name = name;
			this.age = age;
		}
		
		public HuskyBuilder setColor(String color){
			this.color = color;
			return this;
		}
		
		public HuskyBuilder setWeight(Integer weight) {
			this.weight = weight;
			return this;
		}
		
		public Husky build() {
			return new Husky(this);
		}
	}
	
}
