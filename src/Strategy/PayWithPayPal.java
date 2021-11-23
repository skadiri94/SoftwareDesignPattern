package Strategy;

public class PayWithPayPal implements PaymentType{
    private String emailAdd;
    private String password;

    public PayWithPayPal(String emailAdd, String password){
        this.emailAdd = emailAdd;
        this.password = password;

    }
    @Override
    public void pay(double amount) {
        System.out.println("You paid " + amount + " by Paypal.");

    }
}
