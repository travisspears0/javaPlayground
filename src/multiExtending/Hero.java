package multiExtending;

public class Hero extends Human {

    public Hero(String name) {
        super(name);
    }
    
    public BlessedHero getBlessedHero(String sign) {
        return new BlessedHero(sign);
    }
    
    public class BlessedHero extends God {
        
        public BlessedHero(String sign) {
            super(sign);
        }
        
        public String getName() {
            return Hero.this.getName();
        }
        
    }
    
}
