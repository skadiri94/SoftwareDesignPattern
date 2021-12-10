package Strategy;

import javax.swing.*;

public class PayWithPayPal implements PaymentType{
    private String emailAdd;
    private String password;

    public PayWithPayPal(String emailAdd, String password){
        this.emailAdd = emailAdd;
        this.password = password;

    }
    @Override
    public void pay(double amount) {
        String output = "You paid " + amount + " by Paypal.";
        JOptionPane.showMessageDialog(null,"----Paid---\n\n" + output);

    }
}
