package Observer;

public class Notification {
    private Client client;
    private String msg;

    public Notification(Client client){
          this.client = client;
    }
    public String getMsg(){
        return msg;
    }
    public void setMsg(String msg){
        this.msg = msg;
        sendNotification();
    }

    private void sendNotification(){
        client.sendEmail(msg);
    }
}
