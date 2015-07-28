package multiExtending;

public class Human {
    
    private String name;
    
    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void speak() {
        System.out.println("Hey, my name's " + this.name);
    }
    
}
