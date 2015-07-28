package inners;

public class Robot extends Humanoid.Proto implements Machine {
    
    private String id;
    private static int currentRobot=0;
    private static final int MAX_ROBOTS=1000;
    
    public Robot() throws Exception {
        ++Robot.currentRobot;
        if( Robot.currentRobot > 999 ) {
            throw new Exception("Robots limit reached!");
        }
        this.id = this.nextId();
    }
    
    public Robot(String id) throws Exception {
        this();
        this.id = id;
    }
    
    public String nextId() {
        String res="";
        int i=10;
        while(i*Robot.currentRobot<Robot.MAX_ROBOTS) {
            res += "0";
            i*=10;
        }
        res += Robot.currentRobot;
        return res;
    }
    
    public Humanoid android() {
        return new Humanoid() {
            
            @Override
            public void walk() {
                raport("Walking");
            }

            @Override
            public void lie() {
                raport("Lieying");
            }

            @Override
            public void standUp() {
                raport("Standing Up");
            }
        };
    }
    
    private static class Android implements Humanoid{
        
        @Override
        public void walk() {
            System.out.println("[STATIC]: Walking");
        }

        @Override
        public void lie() {
            System.out.println("[STATIC]: Lieying");
        }

        @Override
        public void standUp() {
            System.out.println("[STATIC]: Standing Up");
        }
        
    }
    
    public Humanoid getAndroid() {
        return new Android();
    }

    @Override
    public void repair() {
        
    }
    
    public void raport() {
        System.out.println("Robot ["+ id +"]: #Over!");
    }
    
    public void raport(String info) {
        System.out.println("Robot ["+ id +"]: " + info);
    }

    public String getId() {
        return id;
    }
    
}
