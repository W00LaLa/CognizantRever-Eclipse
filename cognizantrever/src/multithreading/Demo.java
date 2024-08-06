package multithreading;

public class Demo {
    public static void main(String[] args) {
        //FeeThread feeThread = new FeeThread();
        FeeThread feeThread = new FeeThread("ft");
        feeThread.start(); //asking office boy to get water
       // feeThread.run();//it will run on the main thread
        
        LibraryThread libraryThread = new LibraryThread();
        //Thread libThread = new Thread(libraryThread);
        Thread libThread = new Thread(libraryThread,"libt");
        libThread.start();
    }
}