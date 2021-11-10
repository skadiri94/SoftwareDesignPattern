package Decorator;

public abstract class NoodleDecorator implements Noodle {
    protected Noodle noodle;
    public NoodleDecorator(Noodle noodle){
     this.noodle = noodle;
    }
    @Override
    public String getDescription() {
        return noodle.getDescription();
    }

    @Override
    public double getPrice() {
        return noodle.getPrice();
    }

}
