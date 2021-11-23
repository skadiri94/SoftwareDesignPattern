package com.sdp;

import Decorator.Glasses.*;
import Strategy.MakePayment;
import Strategy.PayWithCash;
import Strategy.PayWithCreditCard;
import Strategy.PayWithPayPal;

public class Main {

    public static void main(String[] args) {

        GlassesFrame newGlasses = new Polarized(new BlueLight(new RoundFrame(new Lens("Varifocal",
                20.0), Size.LARGE )));
        GlassesFrame newGlasses2 = new Polarized(new BlueLight(new RoundFrame(new Lens("Bifocal",
                35.0), Size.MEDIUM )));
        System.out.println(newGlasses.getDescription() + "\n 1st Product Total Cost :: €" + newGlasses.getCost());
        System.out.println("\n" + newGlasses2.getDescription() + "\n 2nd Product Total Cost :: €" + newGlasses2.getCost() +" \n\n");

        MakePayment newPayment = new MakePayment();

        newPayment.addUnit(newGlasses);
        newPayment.addUnit(newGlasses2);

        newPayment.pay(new PayWithCreditCard("Sk", "12345567865","09/26", 456));

    }
}
