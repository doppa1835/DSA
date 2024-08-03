package com.dsa.dp.behavioral.strategypattern;

public class NormalDriveStrategy implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("Normal driving");
	}

}
