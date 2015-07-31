package launchers;

public interface LauncherInterface {
    
    void run() throws Exception;
    
    class Launcher implements LauncherInterface {
        
        public void launch() throws Exception {
            System.out.println("---------------------------");
            this.run();
            System.out.println("---------------------------");
        }

        @Override
        public void run() throws Exception {
            
        }
        
    }
    
}
