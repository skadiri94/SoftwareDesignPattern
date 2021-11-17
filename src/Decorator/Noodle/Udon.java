package Decorator.Noodle;

import Decorator.Noodle.Noodle;

public class Udon extends Noodle {

    public Udon(){
        ingredient = "Udo";
    }


    @Override
    public double getPrice() {
        return 2;
    }
}
