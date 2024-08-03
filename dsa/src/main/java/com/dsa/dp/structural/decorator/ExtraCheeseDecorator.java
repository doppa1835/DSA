package com.dsa.dp.structural.decorator;

public class ExtraCheeseDecorator extends ToppingsDecorator {

	private BasePizza basePizza;

	public ExtraCheeseDecorator(BasePizza basePizza) {
		System.out.println("Adding Extra cheese");
		this.basePizza = basePizza;
	}

	@Override
	public int cost() {
		return basePizza.cost() + 20;
	}

}
