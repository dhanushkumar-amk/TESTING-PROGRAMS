package Demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CppProgram {
    public static void main(String[] args) {


        try{
            String cppExectablePath = "";

            ProcessBuilder  pb = new ProcessBuilder(cppExectablePath);
            Process process = pb.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line = reader.readLine();

            while(line != null){
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
