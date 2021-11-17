package Decorator.Glasses;

public abstract  class GlassesFrame {

    protected Lens lens;
    protected  String size;

    public GlassesFrame(Lens lens, String size){
       this.lens = lens;
       this.size = size;
    }

    public String getLenseDetails(){
        return "Lens Type :: " + lens.getType() +
                "\nLens Cost :: " + lens.getCost() +
                "\nSize :: " + size;

    }
    public abstract double getCost();

}
