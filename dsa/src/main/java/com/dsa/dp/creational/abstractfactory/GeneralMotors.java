package com.dsa.dp.creational.abstractfactory;

public class GeneralMotors extends Car {

	@Override
	public Parts getWheels() {
		return new Parts("GeneralMotors wheels");
	}

	@Override
	public String toString() {
		return "GeneralMotors [getWheels()=" + getWheels() + ", getMirrors()=" + getMirrors() + ", getEngine()="
				+ getEngine() + ", getBody()=" + getBody() + "]";
	}

	@Override
	public Parts getMirrors() {
		return new Parts("GeneralMotors mirrors");
	}

	@Override
	public Parts getEngine() {
		return new Parts("GeneralMotors engine");
	}

	@Override
	public Parts getBody() {
		return new Parts("GeneralMotors body");
	}

}
