package multiExtending;

public class Hero extends Human {

    public Hero(String name) {
        super(name);
    }
    
    public static class BlessedHero extends God {
        
        public BlessedHero(String sign) {
            super(sign);
        }
        
    }
    
}
