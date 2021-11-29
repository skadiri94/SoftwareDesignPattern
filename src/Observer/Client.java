package Observer;

import java.util.List;

public class Client implements Subscriber {
    private String name;
    private String emailAdd;

    public Client(String name, String emailAdd){
        this.name = name;
        this.emailAdd = emailAdd;
    }

    @Override
    public void notify(Object obj) {

        if(obj instanceof Subject) {
            Subject recipients = (Subject) obj;
            System.out.println("Hello " + name + ",\n\nThe below order is ready for pick up.\n" +
                    recipients.getMsg() + "\n\nSent to :" + getContact());
        }
    }

    @Override
    public String getContact() {
        return emailAdd;
    }
}
