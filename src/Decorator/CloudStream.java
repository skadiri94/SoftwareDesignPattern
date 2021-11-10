package Decorator;


public class CloudStream  implements Stream{
public CloudStream(String data){
    write(data);
}
    public void write(String data){
        System.out.println("Storing " + data);
    }
}
