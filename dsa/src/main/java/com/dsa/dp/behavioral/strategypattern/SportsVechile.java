package com.dsa.dp.behavioral.strategypattern;

public class SportsVechile extends Vechile {

	public SportsVechile() {
		super(new SportsDriveStrategy());
	}

}
