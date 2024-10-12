package demo2;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program3 {
    public static void main(String[] args) {

        String path = " ";

        try {
           ProcessBuilder processBuilder = new ProcessBuilder(path);
           Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line = reader.readLine();

            while (line != null){
                System.out.println(line);
                line = reader.readLine();
            }
            int exitCode = process.waitFor();
            System.out.println(exitCode);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
