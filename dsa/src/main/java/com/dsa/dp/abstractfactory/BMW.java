package com.dsa.dp.abstractfactory;

public class BMW extends Car {

	@Override
	public Parts getWheels() {
		return new Parts("BMW wheels");
	}

	@Override
	public Parts getMirrors() {
		return new Parts("BMW mirrors");
	}

	@Override
	public Parts getEngine() {
		return new Parts("BMW engine");
	}

	@Override
	public Parts getBody() {
		return new Parts("BMW body");
	}

	@Override
	public String toString() {
		return "BMW [getWheels()=" + getWheels() + ", getMirrors()=" + getMirrors() + ", getEngine()=" + getEngine()
				+ ", getBody()=" + getBody() + "]";
	}

}
