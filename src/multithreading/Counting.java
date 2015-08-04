package multithreading;

import java.util.Random;

public class Counting extends Thread {
    
    private volatile double num=0;
    
    public Counting() {
        this.setDaemon(true);
        this.start();
    }
    
    public void run() {
        while(true) {
            this.num += (new Random()).nextDouble();
        }
    }
    
}
