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
            //this.num += (new Random()).nextDouble();
            double r = (new Random()).nextDouble()*100;
            r = (double)(int)r / 100;
            this.num += r;
            this.num *= 100;
            this.num = (double)(int)this.num / 100;
            System.out.println(this.num);
        }
    }
    
}
