package launchers;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import multithreading.*;
import polymorphism.Child;

public class Multithreading extends LauncherInterface.Launcher {
    
    @Override
    public void run() throws Exception {
        /* *
        Test t = new Test();
        ExecutorService es = Executors.newCachedThreadPool();
        for( int i=0 ; i<3 ; ++i ) {
            es.execute(new Test());
        }
        es.shutdown();
        /* *
        ExecutorService es = Executors.newCachedThreadPool();
        InnerRunnable ir = new InnerRunnable();
        for( int i=0 ; i<3 ; ++i ) {
            Runnable r = ir.getRunnable();
            es.execute(r);
        }
        es.shutdown();
        /* *
        ExecutorService es = Executors.newCachedThreadPool();
        Join    j   = new Join(),
                jj  = new Join(j);
        es.execute(j);
        es.execute(jj);
        es.shutdown();
        /* */
        Join    j   = new Join(),
                jj  = new Join(j);
        /* *
        double d = 0.0;
        for( int i=0 ; i<10 ; ++i ) {
            double r = (new Random()).nextDouble()*100;
            r = (double)(int)r / 100;
            d += r;
            d *= 100;
            d = (double)(int)d / 100;
            System.out.println(""+d);
        }
        /* */
    }
    
}
