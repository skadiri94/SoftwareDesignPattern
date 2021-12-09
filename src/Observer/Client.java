package Observer;

import javax.swing.*;
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
            String output = "Hello " + name + ",\n\nThe below order is ready for pick up.\n" +
                    recipients.getMsg() + "\n\nSent to :" + getContact();
            JOptionPane.showMessageDialog(null, output);
        }
    }

    @Override
    public String getContact() {
        return emailAdd;
    }
}
