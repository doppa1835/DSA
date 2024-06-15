package com.dsa.dp.builder;

public class LowPriceCarBuilder implements CarBuilder {
	private Car car;

	public LowPriceCarBuilder() {
		car = new Car();
	}

	@Override
	public void buildBase() {
		car.setBase("Low price base");
	}

	@Override
	public void buildWheels() {
		car.setWheels("Low price wheels");
	}

	@Override
	public void buildEngine() {
		car.setEngine("Low price engine");
	}

	@Override
	public void buildRoof() {
		car.setRoof("Low price roof");
	}

	@Override
	public void buildMirrors() {
		car.setMirrors("Low price mirrors");
	}

	@Override
	public void buildLights() {
		car.setLights("Low price lights");

	}

	@Override
	public void buildInterior() {
		car.setInterior("Low price interior");
	}

	@Override
	public Car getCar() {
		return car;
	}

}
