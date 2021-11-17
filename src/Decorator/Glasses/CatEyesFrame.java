package Decorator.Glasses;

public class CatEyesFrame extends GlassesFrame{
    public CatEyesFrame(Lens lens, String size) {
        super( lens, size);
    }

    @Override
    public String getLenseDetails(){
        return "Lens Type :: " + lens.getType() +
                "\nLens Cost :: " + lens.getCost() +
                "\nFrame Type :: Cat Eye" +
                "\nSize :: " + size;

    }

    @Override
    public double getCost() {
        return lens.getCost() + 85;
    }
}
