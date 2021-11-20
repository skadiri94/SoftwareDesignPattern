package Decorator.Glasses;

public class CatEyesFrame extends GlassesFrame{
    public CatEyesFrame(Lens lens, Size size) {
        super( lens, size);
        description = "Cat Eyes Frame - €" + Cost.CAT_EYE_FRAME.getValue();
    }

    @Override
    public double getCost() {
        return lens.getCost() + Cost.CAT_EYE_FRAME.getValue() + size.getValue();
    }
}
