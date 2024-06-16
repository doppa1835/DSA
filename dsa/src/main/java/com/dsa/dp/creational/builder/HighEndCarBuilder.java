package com.dsa.dp.creational.builder;

public class HighEndCarBuilder implements CarBuilder {
	private Car car;

	public HighEndCarBuilder() {
		car = new Car();
	}

	@Override
	public void buildBase() {
		car.setBase("High price base");
	}

	@Override
	public void buildWheels() {
		car.setWheels("High price wheels");
	}

	@Override
	public void buildEngine() {
		car.setEngine("High price engine");
	}

	@Override
	public void buildRoof() {
		car.setRoof("High price roof");
	}

	@Override
	public void buildMirrors() {
		car.setMirrors("High price mirrors");
	}

	@Override
	public void buildLights() {
		car.setLights("High price lights");

	}

	@Override
	public void buildInterior() {
		car.setInterior("High price interior");
	}

	@Override
	public Car getCar() {
		return car;
	}

}
