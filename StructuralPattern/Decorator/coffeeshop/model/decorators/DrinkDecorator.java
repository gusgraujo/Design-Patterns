package StructuralPattern.Decorator.coffeeshop.model.decorators;

import StructuralPattern.Decorator.coffeeshop.model.Drink;

public abstract class DrinkDecorator implements Drink {
	protected Drink drink;
	
	public DrinkDecorator(Drink drink) {
		this.drink = drink;
	}
}