package Strategy;

import Decorator.Glasses.GlassesFrame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MakePayment {
     private List<GlassesFrame> units;

    public MakePayment() {
        this.units = new ArrayList<>();
    }

    public void addUnit(GlassesFrame unit){
        this.units.add(unit);
    }

    public void removeUnit(GlassesFrame unit){
        this.units.remove(unit);
    }

    public double getTotalCost(){
        double total = 0;
        for (GlassesFrame unit : units) {
            total += unit.getCost();
        }
        return total;
    }

    public void pay(String op, double amount, String name, String cardNo, String expDate, Integer cvv){
        double amtDue = getTotalCost();

        if(op .equals("C")) {
            float bal = (float) (amount - amtDue);
            System.out.println("Balance is : " + bal);
        }
        else if(op .equals("CC")){
            if (name != null && cardNo != null && expDate != null && cvv != null)
                System.out.println(name + " made a payment of " + amtDue);
            else
                System.out.println(" Credit Card Details not correct, please Try again !");
        }
        else System.out.println("Invalid Payment method Selected!");
    }
}
