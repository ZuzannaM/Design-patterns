package com.moleda.zuzanna.DesignPatterns.model;

public class Labrador extends Dog {

		private static String breed = "labrador";
		private String name;
		private Integer age;
		
		public Labrador(String name, Integer age){
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
			return "Labrador [breed=" + breed + ", name=" + name + ", age=" + age + "]";
		}
		
	}

