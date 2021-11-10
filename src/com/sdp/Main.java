package com.sdp;

import Decorator.Beef;
import Decorator.Chicken;
import Decorator.Noodle;
import Decorator.Udon;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Noodle takeOut = new Beef(new Chicken(new Udon()));

        System.out.println("Recipe ::" + takeOut.getDescription() +
                " \n" + "Price ::" + takeOut.getPrice());


    }
}
