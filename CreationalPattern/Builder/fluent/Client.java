package CreationalPattern.Builder.fluent;


import CreationalPattern.Builder.fluent.model.FastFoodMeal;
import CreationalPattern.Builder.fluent.builder.FastFoodMealBuilder;

public class Client {

    public static void main(String[] args) {
        FastFoodMeal burguerCombo = new FastFoodMealBuilder("Fries")
                .andMain("CheeseBurger")
                .forDrink("Code")
                .thatsAll();
        System.out.println(burguerCombo);

        FastFoodMeal justFries = new FastFoodMealBuilder("Fries").thatsAll();
        System.out.println(justFries);

        FastFoodMeal heartAtackCombo = new FastFoodMealBuilder("Large Fries")
                .andMain("Monster Burguer")
                .forDrink("Milk Shake")
                .andDessert("Fudge Cake")
                .andGift("2 Kilograms")
                .thatsAll();
        System.out.println(heartAtackCombo);
    }
}
