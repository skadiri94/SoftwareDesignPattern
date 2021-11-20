package Decorator.Glasses;

public class SquareFrame extends GlassesFrame {
    public SquareFrame(Lens lens, Size size) {
        super(lens,  size);
        description = "Square Frame - €" + Cost.SQUARE_FRAME.getValue();
    }

    @Override
    public double getCost() {
        return lens.getCost() + Cost.SQUARE_FRAME.getValue() + size.getValue();
    }
}
