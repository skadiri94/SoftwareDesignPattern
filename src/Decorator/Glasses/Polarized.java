package Decorator.Glasses;

public class Polarized extends GlassesAddOns{
    public Polarized(GlassesFrame gFrame) {
        super(gFrame);
    }

    @Override
    public String getDescription() {
        return glassesFrame.getDescription() +
                "\nPolarized coating added - €" + Cost.POLARIZED.getValue() ;
    }

    @Override
    public double getCost() {
        return glassesFrame.getCost() + Cost.POLARIZED.getValue();
    }
}

