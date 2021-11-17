package Decorator.Glasses;

public class Lens {

    private String type;
    private  double cost;

    public Lens(String type, double cost){
        this.type = type;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }
}
