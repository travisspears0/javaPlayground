package javaapplication1;

import launchers.Files;
import launchers.InnerClasses;

public class JavaApplication1 {
    
    public static void main(String[] args) {
        try {
            
            //(new InnerClasses()).launch();
            (new Files()).launch();
            
        } catch(Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
    
}
