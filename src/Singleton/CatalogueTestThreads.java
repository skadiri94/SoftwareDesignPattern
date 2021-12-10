package Singleton;

public class CatalogueTestThreads {
    public static void main(String[] args) {

        Runnable ct = new GetCatalogue();
        Runnable ct2 =  new GetCatalogue();

        new Thread(ct).start();
        new Thread(ct2).start();
    }
}
