package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    public List<Subscriber> getSubscribers(){
        return subscribers;
    }
    public void notifySubscribers(String msg){
        for(Subscriber subscriber: subscribers)
            subscriber.notify(this);
    }

    abstract void setMsg(String msg);
    abstract  String getMsg();
}
