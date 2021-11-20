package Decorator.Glasses;

public class BlueLight extends GlassesAddOns{
    public BlueLight(GlassesFrame gFrame) {
        super(gFrame);
    }

    @Override
    public String getDescription() {
        return glassesFrame.getDescription() +
                "\nBlue light filter coating added - €" + Cost.BLUE_LIGHT.getValue();
    }

    @Override
    public double getCost() {
        return glassesFrame.getCost() + Cost.BLUE_LIGHT.getValue();
    }
}
