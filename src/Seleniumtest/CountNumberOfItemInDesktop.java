package Seleniumtest;

import java.io.File;

public class CountNumberOfItemInDesktop {
    public static void main(String[] args) {
        // Use the direct path to the Desktop directory
        String desktopPath = "C:\\Users\\hp5cd\\OneDrive\\Desktop";

        // Create a File object representing the desktop directory
        File desktopDir = new File(desktopPath);

        // Check if the directory exists and is a directory
        if (desktopDir.exists() && desktopDir.isDirectory()) {
            File[] desktopItems = desktopDir.listFiles();

            // Check if desktopItems is not null to avoid NullPointerException
            if (desktopItems != null) {
                int numItems = desktopItems.length;
                System.out.println("Number of items on the desktop: " + numItems);
            } else {
                System.out.println("Desktop is empty or couldn't list the items.");
            }
        } else {
            System.out.println("Desktop directory does not exist or is not a directory.");
        }
    }
}
