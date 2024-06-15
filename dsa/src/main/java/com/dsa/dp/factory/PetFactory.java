package com.dsa.dp.factory;

public class PetFactory {
	Pet pet = null;

	public Pet getPet(String type) {
		if (type.equals("Dog")) {
			pet = new Dog();
		} else if (type.equals("Cat")) {
			pet = new Cat();
		}
		return pet;
	}
}
