package multithreading;

import java.util.concurrent.TimeUnit;

public class Join extends Thread {
    
    private static int NUM = 0;
    private String id = "Join " + (Join.NUM++) ;
    private Join joined = null;
    
    public Join() {
        this.start();
    }
    
    public Join(Join joined) {
        this.joined = joined;
        this.start();
    }

    public void run() {
        try {
            if( this.joined!=null ) {
                this.joined.join();
            }
            for( int i=0 ; i<5 ; ++i ) {
                System.out.println(this + "   ["+ i +"]");
                TimeUnit.MILLISECONDS.sleep(500);
            }
        } catch(InterruptedException e) {
            System.out.println(this + " has been interrupted");
        }
    }
    
    @Override
    public String toString() {
        return this.id;
    }
    
}
