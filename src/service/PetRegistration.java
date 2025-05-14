package service;

import exception.PetRegistrationException;
import model.entities.Address;
import model.entities.Pet;
import model.entities.PetGender;
import model.entities.PetSpecie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetRegistration {
    FormReader formReader = new FormReader();
    FormDataSave formWriter = new FormDataSave();
    PetRuleValidation petRuleValidation = new PetRuleValidation();
    Address address = new Address();

    Scanner scan = new Scanner(System.in);
    private final String noAnswer = "NOT INFORMED";

    List<Pet> petsForAdoption = new ArrayList<>();

    public void answerAddressQuestion() {
        System.out.println("House's Number: ");
        address.setNumber(scan.nextInt());
        scan.nextLine();
        System.out.println("City name: ");
        address.setCity(scan.nextLine());
        System.out.println("Street name: ");
        address.setStreet(scan.nextLine());
    }

    public void registerAPet() throws PetRegistrationException {
        System.out.println("How many pets will be registered?");
        int howManyPetsToRegister = scan.nextInt();
        scan.nextLine();

        formReader.readForm();

        for (int i = 0; i < howManyPetsToRegister; i++) {
            Pet pet = new Pet();

            System.out.print("1: ");
            String petName = scan.nextLine();
            pet.setName(petName);

            System.out.print("2:Dog/Cat ");
            PetSpecie specie = PetSpecie.valueOf(scan.nextLine().toUpperCase());
            pet.setSpecie(specie);

            System.out.print("3:Female/Male/Unknown ");
            PetGender gender = PetGender.valueOf(scan.nextLine().toUpperCase());
            pet.setGender(gender);

            System.out.println("4: ");
            answerAddressQuestion();
            pet.setAdress(address);

            System.out.print("5: ");
            Integer petAge = scan.nextInt();
            pet.setAge(petAge);
            scan.nextLine();

            System.out.print("6: ");
            Double petWeight = scan.nextDouble();
            pet.setWeight(petWeight);

            scan.nextLine();

            System.out.print("7: ");
            String petBreed = scan.nextLine();
            pet.setBreed(petBreed);

            petRuleValidation.validateData(pet);
            petsForAdoption.add(pet);
            formWriter.saveDataOnFile(pet);

        }
    }


}

