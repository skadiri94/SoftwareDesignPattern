package com.sdp;

import Decorator.Glasses.*;
import Observer.Client;
import Observer.Notification;
import Observer.Subscriber;
import Singleton.Catalogue;
import Strategy.MakePayment;
import Strategy.PayWithCreditCard;


public class Main {

    public static void main(String[] args) {


        Catalogue newCatalog = new Catalogue();

        newCatalog.displayCatalogue();
        GlassesFrame newGlasses = new Polarized(newCatalog.buyFrame("Round Frame"));

        MakePayment newPayment = new MakePayment();
        newPayment.addUnit(newGlasses);


        newPayment.pay(new PayWithCreditCard("Sk", "12345567865","09/26", 456));

        Subscriber cl = new Client("SK", "sk@gmail.com");

        String msg = newGlasses.getDescription() + "\nProduct Total Cost :: €" + newGlasses.getCost();

        Notification newNf = new Notification();

        newNf.addSubscriber(cl);
        newNf.setMsg(msg);

        newCatalog.displayCatalogue();

    }
}
