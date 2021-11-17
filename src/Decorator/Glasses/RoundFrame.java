package Decorator.Glasses;

public class RoundFrame extends GlassesFrame {
    public RoundFrame(Lens lens, String size) {
        super(lens,  size);
    }

    @Override
    public String getLenseDetails(){
        return "Lens Type :: " + lens.getType() +
                "\nLens Cost :: " + lens.getCost() +
                "\nFrame Type :: Round" +
                "\nSize :: " + size;

    }

    @Override
    public double getCost() {
        return lens.getCost() + 65;
    }
}
