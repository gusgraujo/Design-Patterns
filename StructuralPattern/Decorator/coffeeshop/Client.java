package StructuralPattern.Decorator.coffeeshop;

import StructuralPattern.Decorator.coffeeshop.model.Drink;
import StructuralPattern.Decorator.coffeeshop.model.Expresso;
import StructuralPattern.Decorator.coffeeshop.model.Tea;
import StructuralPattern.Decorator.coffeeshop.model.decorators.DoubleDrink;
import StructuralPattern.Decorator.coffeeshop.model.decorators.Milk;


public class Client {
	
	public static void order(String name, Drink drink) {
		System.out.println("Ordering a " + name);
		drink.serve();
		System.out.println(drink.getPrice());
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		order("Expresso", new Expresso());
		order("Tea", new Tea());
		order("Lungo", new DoubleDrink(new Expresso()));
		order("Cafe Au Lait", new Milk(new Expresso()));
		order("English Tea", new Milk(new Tea()));
	}
}
