package view;

import exception.InitialMenuException;
import exception.PetRegistrationException;
import service.FormReader;
import service.PetRegistration;

import java.util.InputMismatchException;
import java.util.Scanner;


public class InitialMenu {
    PetRegistration petRegistration = new PetRegistration();

    Scanner scan = new Scanner(System.in);
    private int menuOptions;

    public InitialMenu() {
    }

    //Menu's functions
    public void showMenu() {
        System.out.println("1- Insert a new pet || 2- Edit the data pets || 3- Delete a data pet || 4- List all data pet" +
                " || 5- List pet's characteristics(age,name,race) || 6- Exit");
    }

    public void handlerUserInput() throws InitialMenuException {
        try {
            System.out.println("Choose an option: ");
            menuOptions = scan.nextInt();
            scan.nextLine();

            while (menuOptions <= 0 || menuOptions > 6) {
                System.out.println("Write a number between 1 and 6: ");
                showMenu();
                menuOptions = scan.nextInt();
                continue;
            }
            switch (menuOptions) {
                case 1:
                    petRegistration.registerAPet();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    break;
                default:
                    throw new InitialMenuException("Invalid Option");
            }
        } catch (InputMismatchException e) {

        } catch (PetRegistrationException e) {
            throw new RuntimeException(e);
        }
    }
}
