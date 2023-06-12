package CreationalPattern.Builder.stantard.builder;

import CreationalPattern.Builder.stantard.model.FastFoodMeal;

public abstract class FastFoodMealBuilder {

    protected FastFoodMeal meal;

    public FastFoodMealBuilder(){
        meal = new FastFoodMeal();
    }

    public FastFoodMeal getMeal(){
        return meal;
    }

    public abstract void buildDrink();
    public abstract void buildMain();
    public abstract void buildSide();
    public abstract void buildDessert();
    public abstract void buildGift();
}
