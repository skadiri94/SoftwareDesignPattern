package Decorator.Glasses;

public class SquareFrame extends GlassesFrame {
    public SquareFrame(Lens lens, String size) {
        super(lens,  size);
    }

    @Override
    public String getLenseDetails(){
        return "Lens Type :: " + lens.getType() +
                "\nLens Cost :: " + lens.getCost() +
                "\nFrame Type :: Square" +
                "\nSize :: " + size;
    }

    @Override
    public double getCost() {
        return lens.getCost() + 75;
    }
}
