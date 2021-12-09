package Decorator.Glasses;

public class RoundFrame extends GlassesFrame {


    public RoundFrame(Lens lens, Size size) {
        super(lens,  size);
        description = "Round Frame - €" + Cost.ROUND_FRAME.getValue();
    }

    @Override
    public double getCost() {
        return lens.getCost() + Cost.ROUND_FRAME.getValue() + size.getValue();
    }
}
