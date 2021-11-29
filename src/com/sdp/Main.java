package com.sdp;

import Decorator.Glasses.*;
import Observer.Client;
import Observer.Notification;
import Observer.PotentialClient;
import Observer.Subscriber;
import Strategy.MakePayment;
import Strategy.PayWithCreditCard;


public class Main {

    public static void main(String[] args) {

        GlassesFrame newGlasses = new Polarized(new BlueLight(new RoundFrame(new Lens("Varifocal",
                20.0), Size.LARGE )));

        MakePayment newPayment = new MakePayment();
        newPayment.addUnit(newGlasses);

        newPayment.pay(new PayWithCreditCard("Sk", "12345567865","09/26", 456));

        Subscriber cl = new Client("SK", "sk@gmail.com");
        Subscriber pc = new PotentialClient("083377515");

        String msg = newGlasses.getDescription() + "\nProduct Total Cost :: €" + newGlasses.getCost();

        Notification newNf = new Notification();

        newNf.addSubscriber(cl);
        newNf.addSubscriber(pc);
        newNf.setMsg(msg);

    }
}
