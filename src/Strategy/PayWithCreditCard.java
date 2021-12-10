package Strategy;

import javax.swing.*;

public class PayWithCreditCard implements PaymentType{
    private String name;
    private String cardNumber;
    private String expDate;
    private Integer cvv;

    public PayWithCreditCard(String name, String cardNo, String expDate, Integer cvv){
        this.name = name;
        this.cardNumber = cardNo;
        this.expDate = expDate;
        this.cvv = cvv;

    }

    @Override
    public void pay(double amount) {
        String output = "Thanks " + name + " you paid " + amount + " by Card.";
        JOptionPane.showMessageDialog(null,"----Paid---\n\n" + output);

    }
}
