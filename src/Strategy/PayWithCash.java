package Strategy;

import javax.swing.*;

public class PayWithCash implements PaymentType{
    private int amount;

    public PayWithCash(int amount){
        this.amount = amount;
    }
    @Override
    public void pay(double amount) {
        String output = "";
        double bal = this.amount - amount;
        if(amount > this.amount)
            output = "Not enough cash";
        else
            output = "Thank you for paying, your Balance is : " + bal;

        JOptionPane.showMessageDialog(null, "----Paid---\n\n" + output);

    }
}
