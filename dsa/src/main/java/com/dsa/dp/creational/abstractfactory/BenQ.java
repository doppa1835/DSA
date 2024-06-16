package com.dsa.dp.creational.abstractfactory;

public class BenQ extends Car {

	@Override
	public Parts getWheels() {
		return new Parts("BenQ wheels");
	}

	@Override
	public Parts getMirrors() {
		return new Parts("BenQ mirrors");
	}

	@Override
	public Parts getEngine() {
		return new Parts("BenQ engine");
	}

	@Override
	public Parts getBody() {
		return new Parts("BenQ body");
	}

	@Override
	public String toString() {
		return "BenQ [getWheels()=" + getWheels() + ", getMirrors()=" + getMirrors() + ", getEngine()=" + getEngine()
				+ ", getBody()=" + getBody() + "]";
	}

}
