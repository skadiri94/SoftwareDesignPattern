package Decorator.Noodle;

public class Chicken extends NoodleDecorator {
    public Chicken(Noodle noodle) {
        super(noodle);
    }

    @Override
    public String getIngredient() {
        return noodle.getIngredient() + ", Chicken ";
    }

    @Override
    public double getPrice() {
        return noodle.getPrice() + 1.80;
    }
}
