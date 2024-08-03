package com.dsa.dp.behavioral.strategypattern;

public class SportsDriveStrategy implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("Sports driving");
	}

}
