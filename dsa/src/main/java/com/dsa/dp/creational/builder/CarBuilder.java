package com.dsa.dp.creational.builder;

public interface CarBuilder {
	public void buildBase();

	public void buildWheels();

	public void buildEngine();

	public void buildRoof();

	public void buildMirrors();

	public void buildLights();

	public void buildInterior();

	public Car getCar();
}
