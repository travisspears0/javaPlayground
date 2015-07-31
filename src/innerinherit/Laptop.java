package innerinherit;

public class Laptop {
    
    private String id;
    
    public Laptop(String id) {
        this.id = id;
    }
    
    public class MacBook extends Machine.Computer {
        
        public MacBook(Machine computer) {
            computer.super(computer.getId());
        }
        
    }
    
    public MacBook getMacBook(Machine m) {
        return new MacBook(m);
    }
    
}
