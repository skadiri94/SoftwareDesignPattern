package com.sdp;

import Decorator.Glasses.*;
import Strategy.MakePayment;

public class Main {

    public static void main(String[] args) {

        GlassesFrame newGlasses = new Polarized(new BlueLight(new RoundFrame(new Lens("Varifocal",
                50.0), Size.LARGE )));
        System.out.println(newGlasses.getDescription() + "\nTotal Cost :: €" + newGlasses.getCost());

        MakePayment newPayment = new MakePayment();

        newPayment.addUnit(newGlasses);

        newPayment.pay("CC", 150, "Suleman Kadiri" ,
                "123456789012345" ,"09/25", 123 );

    }
}
