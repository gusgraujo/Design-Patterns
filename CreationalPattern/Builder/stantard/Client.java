package CreationalPattern.Builder.stantard;

import CreationalPattern.Builder.stantard.builder.FastFoodMealBuilder;
import CreationalPattern.Builder.stantard.builder.FatMealBuilder;
import CreationalPattern.Builder.stantard.builder.JustFriesBuilder;
import CreationalPattern.Builder.stantard.builder.MenuBuilder;
import CreationalPattern.Builder.stantard.director.MealDirector;

public class Client {

    public static void order(String name, FastFoodMealBuilder builder) {
        System.out.println("Ordering a " + name);
        MealDirector director = new MealDirector(builder);
        director.constructCombo();
        System.out.println(director.getCombo());

        System.out.println("------------------");
    }

    public static void main(String[] args) {
        order("Burguer", new MenuBuilder());
        order("Just Fries", new JustFriesBuilder());
        order("Heart Atack", new FatMealBuilder());
    }
}
