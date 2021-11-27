package Observer;

public class Client {
    private String name;
    private String emailAdd;

    public Client(String name, String emailAdd){
        this.name = name;
        this.emailAdd = emailAdd;
    }

    public void sendEmail(String msg){
        System.out.println("Hello " +name + ",\n\nThe below order is ready for pick up.\n" +
                msg + "\n\nSent to :" + emailAdd);
    }
}
