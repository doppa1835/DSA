package com.dsa.dp.structural.decorator;

public class MashroomDecorator extends ToppingsDecorator {
	private BasePizza basePizza;

	public MashroomDecorator(BasePizza basePizza) {
		System.out.println("Adding Mushroom");
		this.basePizza = basePizza;
	}

	@Override
	public int cost() {
		return basePizza.cost() + 50;
	}

}
