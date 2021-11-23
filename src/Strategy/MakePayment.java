package Strategy;

import Decorator.Glasses.GlassesFrame;

import java.util.ArrayList;
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

    public void pay(double amount){
        double amtDue = getTotalCost();
        float bal = (float) (amount - amtDue);

        System.out.println("Balance is : " + bal);

    }

}
