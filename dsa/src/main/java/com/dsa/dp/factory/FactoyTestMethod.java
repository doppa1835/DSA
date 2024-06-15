package com.dsa.dp.factory;

public class FactoyTestMethod {
	public static void main(String[] args) {
		PetFactory factory = new PetFactory();
		Pet pet = factory.getPet("Dog");
		System.out.println(pet.petSound());
	}
}
