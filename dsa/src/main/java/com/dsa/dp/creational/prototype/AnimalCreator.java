package com.dsa.dp.creational.prototype;

public class AnimalCreator {
	private Chicken chicken;
	private Sheep sheep;

	public AnimalCreator() {
		chicken = new Chicken();
		chicken.setDescription("chicken");
		chicken.setName("Chicken");
		chicken.setNumberOfLegs(2);
		sheep = new Sheep();
		sheep.setDescription("Sheep");
		sheep.setName("Sheep");
		sheep.setNumberOfLegs(4);
	}

	public Animal retriveAnimal(String animalType) {
		try {
			if ("Chicken".equals(animalType)) {
				return chicken.clone();
			} else if ("Sheep".equals(animalType)) {
				return sheep.clone();
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		AnimalCreator animalCreator = new AnimalCreator();
		Animal[] animalFarm = new Animal[6];
		animalFarm[0] = animalCreator.retriveAnimal("Chicken");
		animalFarm[1] = animalCreator.retriveAnimal("Chicken");
		animalFarm[1].setDescription("Good chicken");
		animalFarm[3] = animalCreator.retriveAnimal("Sheep");
		animalFarm[4] = animalCreator.retriveAnimal("Sheep");
		for (Animal animal : animalFarm) {
			System.out.println(animal);
		}
		System.out.println((animalFarm[0].equals(animalFarm[1])));

	}
}
