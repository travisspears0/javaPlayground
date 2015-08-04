package javaapplication1;

import launchers.*;

public class JavaApplication1 {
    
    public static void main(String[] args) {
        try {
            
            //(new InnerClasses()).launch();
            //(new Files()).launch();
            (new Multithreading()).launch();
            
        } catch(Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
    
}
