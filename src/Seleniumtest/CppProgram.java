package Seleniumtest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CppProgram {
    public static void main(String[] args)
    {
        String cppExecutablePath ="C:\\Users\\hp5cd\\OneDrive\\Documents\\Add.cpp";
        try
        {
            ProcessBuilder processBuilder = new ProcessBuilder(cppExecutablePath);
            Process process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while((line = reader.readLine())!=null)
            {
                System.out.println("Output from C++ program:"+line);
            }
            int exitCode = process.waitFor();
            System.out.println("C++ program exited with code:"+exitCode);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
