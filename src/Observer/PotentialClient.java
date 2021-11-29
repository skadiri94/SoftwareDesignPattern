package Observer;

import java.util.List;

public class PotentialClient implements Subscriber {
    private String phoneNo;

    public PotentialClient( String phoneNo){
        this.phoneNo = phoneNo;
    }


    @Override
    public void notify(Object obj) {
        if(obj instanceof Subject) {
            Subject recipients = (Subject) obj;
            System.out.println(recipients.getMsg() + "\n\nSent to :" + getContact());
        }
    }

    @Override
    public String getContact() {
        return phoneNo;
    }
}
