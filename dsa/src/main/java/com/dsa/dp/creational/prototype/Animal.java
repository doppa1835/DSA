package com.dsa.dp.creational.prototype;

public class Animal implements Cloneable {
	private String name;
	private int numberOfLegs;
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	protected Animal clone() throws CloneNotSupportedException {
//		Animal clonedAnimal = null;
//		try {
//			clonedAnimal = (Animal) super.clone();
//			clonedAnimal.setDescription(description);
//			clonedAnimal.setName(name);
//			clonedAnimal.setNumberOfLegs(numberOfLegs);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		// return clonedAnimal;
		return (Animal) super.clone();
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", numberOfLegs=" + numberOfLegs + ", description=" + description + "]";
	}

}
