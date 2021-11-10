package Decorator;

public class Chicken extends NoodleDecorator{
    public Chicken(Noodle noodle) {
        super(noodle);
    }

    @Override
    public String getDescription() {
        return noodle.getDescription() + ", Chicken was added";
    }

    @Override
    public double getPrice() {
        return noodle.getPrice() + 1.80;
    }
}
