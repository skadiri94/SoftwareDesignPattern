package Decorator;

public class Beef extends NoodleDecorator {
    public Beef(Noodle noodle) {
        super(noodle);
    }

    @Override
    public String getDescription() {
        return noodle.getDescription() + ", Beef was added";
    }

    @Override
    public double getPrice() {
        return noodle.getPrice() + 2.5;
    }

}
