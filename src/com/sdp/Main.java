package com.sdp;

import Decorator.Glasses.GlassesFrame;
import Decorator.Glasses.Lens;
import Decorator.Glasses.SquareFrame;

public class Main {

    public static void main(String[] args) {

        GlassesFrame newGlasses = new SquareFrame(new Lens("Varifocal", 55.0), "Medium" );
        System.out.println(newGlasses.getLenseDetails() + "\nTotal Cost :: € " + newGlasses.getCost());



    }
}
