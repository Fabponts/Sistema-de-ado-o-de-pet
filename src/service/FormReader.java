package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class FormReader {
    Scanner scan = new Scanner(System.in);

    String path = "F:\\projetosJava\\Sistema de adocao\\petsCadastrados\\formulario.txt";
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
