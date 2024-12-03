package nov30;

import java.util.List;

public class Dish {

    private final String name;
    private final int calories;
    private final double price;
    private final List<String> ingredients;
    private final DishType dishtype;

    public Dish(String name, int calories, double price, List<String> ingredients, DishType dishtype) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.ingredients = ingredients;
        this.dishtype = dishtype;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public DishType getDishtype() {
        return dishtype;
    }
}
