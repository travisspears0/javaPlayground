package innerinherit;

public class Machine {
    
    private String id = "xxx";
    
    public Machine(String id) {
        this.id = id;
    }
    
    public void thingFromMachine(Thing t) {
        t.work();
    }
    
    class Computer {
        public Computer(String id) {
            Machine.this.id = id;
        }
        public String getId() {
            return Machine.this.id;
        }
    }

    public String getId() {
        return id;
    }
    
    public Thing getThing(int id) {
        return new Thing(id) {
            
            @Override
            public void work() {
                System.out.println(Machine.this.getId() + " working thing no." + this.id);
            }
            
        };
    }
    
}
