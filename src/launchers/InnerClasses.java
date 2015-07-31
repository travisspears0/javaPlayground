package launchers;

import innerinherit.Laptop;
import innerinherit.Machine;
import innerinherit.Thing;
import inners.Humanoid;
import inners.Robot;
import multiExtending.Hero;

public class InnerClasses extends LauncherInterface.Launcher {
    
    @Override
    public void run() throws Exception {
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
        Laptop lap = new Laptop("lap");
        Laptop.MacBook mac = lap.getMacBook(new Machine("comp"));
        System.out.println(mac.getId());

        Laptop.MacBook mmm = lap.new MacBook(new Machine("sss"));
        System.out.println(mmm.getId());

        Thing t = (new Machine("heey")).getThing(213);
        t.work();
        System.out.println(t);
        (new Machine("aaaaaa")).thingFromMachine(t);
    }
    
}
