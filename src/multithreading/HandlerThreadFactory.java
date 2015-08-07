package multithreading;

import java.util.concurrent.ThreadFactory;

public class HandlerThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setUncaughtExceptionHandler(new UncaughtExceptionHandler());
        return t;
    }

}
