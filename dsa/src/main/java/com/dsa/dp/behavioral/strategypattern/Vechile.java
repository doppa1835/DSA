package com.dsa.dp.behavioral.strategypattern;

public class Vechile {
	private DriveStrategy driveStrategy;

	public Vechile(DriveStrategy driveStrategy) {
		this.driveStrategy = driveStrategy;
	}

	public void drive() {
		driveStrategy.drive();
	}
}
