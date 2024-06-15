package com.dsa.dp.abstractfactory;

public class CarType {
	private Car car;

	public static void main(String[] args) {
		CarType carType = new CarType();
		Car car = carType.getCar("BenQ");
		System.out.println(car);
	}

	public Car getCar(String carType) {
		if (carType.equals("BenQ")) {
			car = new BenQ();
		} else if (carType.equals("BMW")) {
			car = new BMW();
		} else if (carType.equals("GenralMotors")) {
			car = new GeneralMotors();
		}

		return car;
	}
}
