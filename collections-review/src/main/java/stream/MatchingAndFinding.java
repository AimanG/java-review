package stream;

import stream.Dish;
import stream.DishData;

import java.util.Optional;

public class MatchingAndFinding {
    public static void main(String[] args) {

        //All match
        System.out.println("*****************");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);

        //Any match
        System.out.println("*****************");
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian))
            System.out.println("The menu is vegetarian friendly");

        //NON Match
        System.out.println("*****************");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy2);

        //Find any
        System.out.println("*****************");
        Optional<Dish> dish = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish);

        //Find first
        System.out.println("*****************");
        Optional<Dish> dish2 = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findFirst();
        System.out.println(dish2.get());

    }
}
