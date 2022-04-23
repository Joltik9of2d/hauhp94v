package views;

import controllers.MainController;
import manager.ManagerEmployee;
import manager.ManagerService;
import manager.TuHoSo;

public class Main {
    public static void main(String[] args) {
//        ManagerEmployee.addEmployee();
//MainController.displayMainMenu();
//        TuHoSo.themHoSo();
//        TuHoSo.timKiemHoSo("006");
        ManagerService.muaVeXemPhim();
        ManagerService.inDanhSachVeXemPhim();
    }
}
