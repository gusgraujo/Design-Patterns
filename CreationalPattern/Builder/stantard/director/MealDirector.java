package CreationalPattern.Builder.stantard.director;

import CreationalPattern.Builder.stantard.builder.FastFoodMealBuilder;
import CreationalPattern.Builder.stantard.model.FastFoodMeal;

public class MealDirector {

    private FastFoodMealBuilder builder;

    public MealDirector(FastFoodMealBuilder builder) {
        this.builder = builder;
    }

    public void constructCombo() {
        builder.buildDrink();
        builder.buildMain();
        builder.buildSide();
        builder.buildDessert();
        builder.buildGift();
    }

    public FastFoodMeal getCombo() {
        return builder.getMeal();
    }
}
