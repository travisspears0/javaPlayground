package javaapplication1;

import inners.Humanoid;
import inners.Robot;
import multiExtending.*;

public class JavaApplication1 {
    
    public static void main(String[] args) {
        try {
            Robot rb = new Robot("Custom model");
            try {
                for( ; ; ) {
                    (new Robot()).raport();
                }
            } catch(Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
            Humanoid h = rb.android();
            h.walk();
            Humanoid hh = rb.getAndroid();
            hh.lie();
            (new Humanoid.Proto()).walk();
            rb.walk();
            
            Hero hero = new Hero("Rav");
            Hero.BlessedHero bh = hero.getBlessedHero("circle");
            System.out.println(bh.getName());
            System.out.println(bh.getSign());
            
        } catch(Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
    
}
