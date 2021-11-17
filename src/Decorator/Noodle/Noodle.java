package Decorator.Noodle;

public abstract class Noodle {
    String ingredient = "Choose your Incridents";

    public String getIngredient(){
        return ingredient;
    }
    public abstract double getPrice();
}

