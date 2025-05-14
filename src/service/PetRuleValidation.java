package service;

import exception.PetRegistrationException;
import model.entities.Pet;

import java.util.ArrayList;
import java.util.List;

public class PetRuleValidation {
    Pet pet = new Pet();

    public void validateData(Pet pet) throws PetRegistrationException {
        List<String> conditionToVerifyRegisterErrors = new ArrayList<>();

        if (pet.getName().trim().split(" ").length < 2) {
            conditionToVerifyRegisterErrors.add("The pet should've name and surname please");
        }
        if (!pet.getName().matches("[a-zA-Z ]+") || !pet.getBreed().matches("[a-zA-Z ]+")) {
            conditionToVerifyRegisterErrors.add("It must use A-Z letters");
        }
        if (pet.getAge() > 20) {
            conditionToVerifyRegisterErrors.add("The age is advanced! Normally under 20");
        }
        if (pet.getWeight() < 0.5 || pet.getWeight() > 60) {
            conditionToVerifyRegisterErrors.add("The weight is high please verify again! Normally more than 0.5 and less than 60");
        }
        if (pet.getName() == null || pet.getBreed() == null || pet.getWeight() == null || pet.getAge() == null || pet.getAdress().getNumber() == null) {
            System.out.println();
        }
        if ((!conditionToVerifyRegisterErrors.isEmpty())) {
            throw new PetRegistrationException(String.join("\n", conditionToVerifyRegisterErrors));
        }
    }
}
