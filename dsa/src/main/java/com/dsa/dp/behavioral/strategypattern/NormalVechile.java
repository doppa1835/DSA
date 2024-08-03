package com.dsa.dp.behavioral.strategypattern;

public class NormalVechile extends Vechile {

	public NormalVechile() {
		super(new NormalDriveStrategy());
	}

}
