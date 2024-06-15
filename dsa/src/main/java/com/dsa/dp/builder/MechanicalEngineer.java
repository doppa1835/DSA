package com.dsa.dp.builder;

public class MechanicalEngineer {
	private CarBuilder carBuilder;

	public MechanicalEngineer(CarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}

	public void buldCar() {
		carBuilder.buildBase();
		carBuilder.buildEngine();
		carBuilder.buildInterior();
		carBuilder.buildLights();
		carBuilder.buildMirrors();
		carBuilder.buildRoof();
		carBuilder.buildWheels();
	}

	public static void main(String[] args) {
		CarBuilder carBuilder = new HighEndCarBuilder();
		MechanicalEngineer mechanicalEngineer = new MechanicalEngineer(carBuilder);
		mechanicalEngineer.buldCar();
		Car car = carBuilder.getCar();
		System.out.println(car);
	}

}
