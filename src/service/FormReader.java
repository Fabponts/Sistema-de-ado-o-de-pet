package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FormReader {
    String path = "C:\\Users\\fabri\\Documents\\formulario.txt";

    public void readForm() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
