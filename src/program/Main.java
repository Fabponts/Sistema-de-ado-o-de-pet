package program;

import exception.InitialMenuException;
import service.FormReader;
import view.InitialMenu;

public class Main {
    public static void main(String[] args) throws InitialMenuException {
        FormReader formReader = new FormReader();
        InitialMenu initialMenu = new InitialMenu();

        //Show and interact with the menu
        initialMenu.showMenu();
        initialMenu.handlerUserInput();

    }
}