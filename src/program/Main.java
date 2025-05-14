package program;

import exception.InitialMenuException;
import model.entities.Address;
import service.FormReader;
import view.InitialMenu;

public class Main {
    public static void main(String[] args) throws InitialMenuException {
        //Creating objects
        FormReader formReader = new FormReader();
        InitialMenu initialMenu = new InitialMenu();
        Address address = new Address();

        //Show and interact with the menu
        initialMenu.showMenu();
        initialMenu.handlerUserInput();

    }
}