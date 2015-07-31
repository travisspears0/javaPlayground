package launchers;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Files extends LauncherInterface.Launcher {
    
    @Override
    public void run() {
        
        File file = new File(".");
        String[] filesArray = file.list();
        Arrays.sort(filesArray, String.CASE_INSENSITIVE_ORDER);
        ArrayList<String> files = new ArrayList<>(Arrays.asList(filesArray));
        for( String f : files ) {
            System.out.println(f);
        }
    }
    
}
