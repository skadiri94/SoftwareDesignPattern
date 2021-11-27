package com.sdp;

import Decorator.Glasses.*;
import Observer.Client;
import Observer.Notification;
import Strategy.MakePayment;
import Strategy.PayWithCreditCard;


public class Main {

    public static void main(String[] args) {

        GlassesFrame newGlasses = new Polarized(new BlueLight(new RoundFrame(new Lens("Varifocal",
                20.0), Size.LARGE )));

        MakePayment newPayment = new MakePayment();
        newPayment.addUnit(newGlasses);

        newPayment.pay(new PayWithCreditCard("Sk", "12345567865","09/26", 456));

        Client cl = new Client("SK", "sk@gmail.com");

        String msg = newGlasses.getDescription() + "\nProduct Total Cost :: €" + newGlasses.getCost();

        Notification newNf = new Notification(cl);
        newNf.setMsg(msg);

    }
}
