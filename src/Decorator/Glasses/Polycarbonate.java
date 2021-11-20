package Decorator.Glasses;

public class Polycarbonate extends GlassesAddOns {

    public Polycarbonate(GlassesFrame gFrame) {
        super(gFrame);
    }

    @Override
    public String getDescription() {
        return glassesFrame.getDescription() + "\nPolycarbonate added - €" + Cost.POLYCARBONATE.getValue();
    }

    @Override
    public double getCost() {
        return glassesFrame.getCost() + Cost.POLYCARBONATE.getValue();
    }

}
