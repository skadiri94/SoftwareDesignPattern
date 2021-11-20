package Decorator.Glasses;

public class AntiReflective extends GlassesAddOns{
    public AntiReflective(GlassesFrame gFrame) {
        super(gFrame);
    }
    @Override
    public String getDescription() {
        return glassesFrame.getDescription() +
                "\nAnti-Reflective coating added - €" + Cost.ANTI_REFLECTIVE.getValue();
    }
    @Override
    public double getCost() {
        return glassesFrame.getCost() + Cost.ANTI_REFLECTIVE.getValue();
    }
}
