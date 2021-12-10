package Singleton;

public class GetCatalogue implements Runnable{
    @Override
    public void run() {
        Catalogue ct = Catalogue.getInstance();
        System.out.println("Before Purchase" + "Instace ID : "+ System.identityHashCode(ct));
        ct.displayCatalogue();
        ct.buyFrame("Round Frame");
        System.out.println("\n---------------------------------\n"+"After Purchase" +
                "Instace ID : "+ System.identityHashCode(ct));
        ct.displayCatalogue();
    }
}
