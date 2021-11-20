package com.sdp;

import Decorator.Glasses.*;

public class Main {

    public static void main(String[] args) {

        GlassesFrame newGlasses = new Polarized(new BlueLight(new RoundFrame(new Lens("Varifocal", 50.0), Size.LARGE )));
        System.out.println(newGlasses.getDescription() + "\nTotal Cost :: €" + newGlasses.getCost());



    }
}
