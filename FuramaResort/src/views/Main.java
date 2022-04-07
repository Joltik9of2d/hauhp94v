package views;

import controllers.MainController;
import manager.ManagerEmployee;

public class Main {
    public static void main(String[] args) {
        ManagerEmployee.addEmployee();
MainController.displayMainMenu();
    }
}
