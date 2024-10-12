package Demo;

import java.io.File;

public class DesktopItems {
    public static void main(String[] args) {

//        String desktopPath = "C:\\Users\\hp5cd\\OneDrive\\Desktop";

        String desktopPath = "C:\\Users\\hp5cd\\OneDrive\\Desktop";

        File disktopDir = new File(desktopPath);

        if (disktopDir.exists() && disktopDir.isDirectory()){
            File[] files = disktopDir.listFiles();

            int noOfFiles = files.length;

            System.out.println(noOfFiles);
        }
        else{
            System.out.println("no files found");
        }
    }
}
