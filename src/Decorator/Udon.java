package Decorator;

public class Udon implements Noodle{
    @Override
    public String getDescription() {
        return "Udon was selected for base";
    }

    @Override
    public double getPrice() {
        return 2;
    }
}
