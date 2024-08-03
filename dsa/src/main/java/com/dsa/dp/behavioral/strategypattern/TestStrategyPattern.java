package com.dsa.dp.behavioral.strategypattern;

public class TestStrategyPattern {
	public static void main(String[] args) {
		Vechile vechile = new NormalVechile();
		vechile.drive();
		vechile = new SportsVechile();
		vechile.drive();
	}
}
