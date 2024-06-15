package com.dsa.dp.builder;

public class Car implements CarPlan {

	private String base;
	private String wheels;
	private String engine;
	private String roof;
	private String lights;
	private String interior;
	private String mirrors;

	@Override
	public void setBase(String base) {
		this.base = base;
	}

	@Override
	public void setWheels(String wheels) {
		this.wheels = wheels;
	}

	@Override
	public void setEngine(String engine) {
		this.engine = engine;
	}

	@Override
	public void setRoof(String roof) {
		this.roof = roof;
	}

	@Override
	public void setLights(String lights) {
		this.lights = lights;

	}

	@Override
	public void setInterior(String interior) {
		this.interior = interior;

	}

	@Override
	public void setMirrors(String mirrors) {
		this.mirrors = mirrors;
	}

	@Override
	public String toString() {
		return "Car [base=" + base + ", wheels=" + wheels + ", engine=" + engine + ", roof=" + roof + ", lights="
				+ lights + ", interior=" + interior + ", mirrors=" + mirrors + "]";
	}

}
