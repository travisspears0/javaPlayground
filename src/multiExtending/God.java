package multiExtending;

public class God {
    
    private String sign;
    
    public God(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }
    
    public void Bless(String name) {
        System.out.println("I'm blessing" + name + " with my " + this.sign);
    }
    
}
