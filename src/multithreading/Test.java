package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Test implements Runnable {
    
    private static int NUMTEST = 0;
    
    String id = "Test " + Test.NUMTEST ;
    
    public Test() {}

    @Override
    public void run() {
        try {
            for( int i=0 ; i<5 ; ++i ) {
                System.out.println(this + "   ["+ i +"]");
                TimeUnit.MILLISECONDS.sleep(500);
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public String toString() {
        return this.id;
    }
    
}
