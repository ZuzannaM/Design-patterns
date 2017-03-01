package com.moleda.zuzanna.DesignPatterns;

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
	
	public Dog getDog(String breed, String name, Integer age){
		if("husky".equalsIgnoreCase(breed)) {
			return new Husky(name, age);
		} else if ("labrador".equalsIgnoreCase(breed)) {
			return new Labrador(name, age);
		} else if ("beagle".equalsIgnoreCase(breed)) {
			return new Beagle(name, age);
		} else {
			return null;
		}
	}
}
