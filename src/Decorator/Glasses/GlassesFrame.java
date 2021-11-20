package Decorator.Glasses;

public abstract  class GlassesFrame {
    protected Lens lens;
    protected   Size size;
    String description = "No Frame Selected";

    public GlassesFrame(){}

    public GlassesFrame(Lens lens, Size size){
       this.lens = lens;
       this.size = size;
    }

    public String getDescription(){
        return "Lens Type :: " + lens.getType() +
                "\nLens Cost :: " + lens.getCost() +
                "\nFrame Type :: " + description +
                "\nSize :: " + size + " + €" + size.getValue() ;

    }
    public abstract double getCost();

}
