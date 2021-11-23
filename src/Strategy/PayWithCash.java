package Strategy;

public class PayWithCash implements PaymentType{
    private int amount;

    public PayWithCash(int amount){
        this.amount = amount;
    }
    @Override
    public void pay(double amount) {
        double bal = this.amount - amount;
        if(amount > this.amount)
            System.out.println("Not enough cash");
        else
            System.out.println("Thank you for paying, your Balance is : " + bal);

    }
}
