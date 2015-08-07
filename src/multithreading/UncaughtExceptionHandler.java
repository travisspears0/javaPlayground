package multithreading;

public class UncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t+" cought an exception ["+e.getLocalizedMessage()+"]");
    }

}
