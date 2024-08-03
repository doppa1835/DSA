package com.dsa.dp.structural.decorator;

public class TestDecorator {
	public static void main(String[] args) {
		BasePizza basePizza = new ExtraCheeseDecorator(new MashroomDecorator(new VegDelight()));
		System.out.println("Total coast :: " + basePizza.cost());
	}
}
