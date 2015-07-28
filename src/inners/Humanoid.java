package inners;

public interface Humanoid {
    void walk();
    void lie();
    void standUp();
    
    class Proto implements Humanoid{

        @Override
        public void walk() {
            System.out.println("Walk test!");
        }

        @Override
        public void lie() {
            System.out.println("Lie test!");
        }

        @Override
        public void standUp() {
            System.out.println("Stand up test!");
        }
        
    }
}
