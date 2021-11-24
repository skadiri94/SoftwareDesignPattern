package Decorator.Glasses;

public abstract class GlassesAddOns extends GlassesFrame {
    protected GlassesFrame glassesFrame;

    public GlassesAddOns(GlassesFrame gFrame) {
        glassesFrame = gFrame;
    }

    public abstract String getDescription();
}

