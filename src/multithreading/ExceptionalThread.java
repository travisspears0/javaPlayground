package multithreading;

public class ExceptionalThread implements Runnable {

    @Override
    public void run() {
        for( int i=0 ; i<10 ; ++i ) {
            if( i>5 ) {
                throw new RuntimeException("i > 5");
            }
            System.out.println(i);
        }
    }
    
}
