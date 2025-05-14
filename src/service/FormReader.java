package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FormReader {
    String path = "F:\\projetosJava\\Sistema de adocao\\petsCadastrados\\formulario.txt";
    public void formReader() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = br.readLine();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
    }
    public void read(){
        try{
            formReader();
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
