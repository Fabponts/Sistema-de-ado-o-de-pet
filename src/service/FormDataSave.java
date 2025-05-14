package service;

import model.entities.Pet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormDataSave {


    public void createAFormatterFileName(Pet pet){
        DateTimeFormatter dateFormatterForFile = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
        LocalDateTime localDateTime = LocalDateTime.now();
        String formattedDate = localDateTime.format(dateFormatterForFile);
        String nameFormattedToFile = pet.getName().replaceAll("\\s+"," ").trim().toUpperCase();
        String path = "F:\\projetosJava\\Sistema de adocao\\petsCadastrados" + formattedDate + "-" + nameFormattedToFile;
    }
    public void writeDataOnFile(Pet pet) throws IOException{

        BufferedWriter writer = new BufferedWriter(new FileWriter(createAFormatterFileName(),true));
            writer.write("Name: " + pet.getName() + "\n");
            writer.write("Specie: " + pet.getSpecie() +"\n");
            writer.write("Gender " + pet.getGender() + "\n");
            writer.write("Address: " + pet.getAdress()+ "\n");
            writer.write("Age: " + pet.getAge()+ "\n");
            writer.write("Weight: " + pet.getWeight() + "\n");
            writer.write("Breed: " + pet.getBreed() + "\n");

            System.out.println("DATA SAVED");
    }
    public void saveData(Pet pet){
        try{
            writeDataOnFile(pet);
        }catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }
    }

}
