package Decorator;

public class Beef extends NoodleDecorator {
    public Beef(Noodle noodle) {
        super(noodle);
    }

    @Override
    public String getIngredient() {
        return noodle.getIngredient() + ", Beef ";
    }

    @Override
    public double getPrice() {
        return noodle.getPrice() + 2.5;
    }

}
