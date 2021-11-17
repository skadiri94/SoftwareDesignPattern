package Decorator.Noodle;

import Decorator.Noodle.Noodle;

public abstract class NoodleDecorator extends Noodle {
    protected Noodle noodle;
    public NoodleDecorator(Noodle noodle){
     this.noodle = noodle;
    }

    public abstract String getIngredient();
}
