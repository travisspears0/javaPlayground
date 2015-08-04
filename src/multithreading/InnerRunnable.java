package multithreading;

import java.util.concurrent.TimeUnit;

public class InnerRunnable {
    
    private int counter=5;
    private static int NUM = 0;
    
    public InnerRunnable(){}
    
    public InnerRunnable(int counter) {
        this.counter = counter;
    }
    
    public Runnable getRunnable() {
        return new Runnable() {
            
            private String id= "Runnable ["+ (InnerRunnable.NUM++) +"]";

            @Override
            public void run() {
                try {
                    for( int i=0 ; i<InnerRunnable.this.counter ; ++i ) {
                        System.out.println(this.id + " - " + i);
                        Thread.sleep(500);
                    }
                } catch( InterruptedException e ) {
                    e.printStackTrace();
                }
            }
            
        };
    }
    
}
