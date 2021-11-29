package Observer;

public class Notification extends Subject {
    private String msg;

    public Notification(){

    }
    public String getMsg(){
        return msg;
    }
    public void setMsg(String msg){
        this.msg = msg;
        notifySubscribers(msg);
    }

}
