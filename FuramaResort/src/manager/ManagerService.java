package manager;

import models.Services;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerService {
    public void addNewServies(){
        List<Services> servicesList = new ArrayList<>();
        List<Services> villaList = new ArrayList<>();
        List<Services> houseList = new ArrayList<>();
        List<Services> roomList = new ArrayList<>();
        System.out.println("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "5.\tExit\n");
        Scanner scanner = new Scanner(System.in);
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                System.out.print("Nhập id villa (SVVL-1234) : ");
                String idVilla = scanner.nextLine();
                System.out.print("Nhập tên villa (Villa): ");
                String nameVilla = scanner.nextLine();
                System.out.print("Nhập diện tích sử dụng (>30) mét vuông: ");
                double usableArea = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập chi phí thuê: ");
                double rentalCost = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập số người tối đa: ");
                int maxNumberOfPeople = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập kiểu thuê (Gio, Ngay, Thang, Nam): ");
                String rentalType = scanner.nextLine();
                System.out.print("Nhập tiêu chuẩn phòng (1*-5*): ");
                String roomStandard = scanner.nextLine();
                System.out.println("Nhập tiện nghi khác: ");
                String amenitie = scanner.nextLine();
                System.out.println("Nhập diện tích hồ bơi (>30): ");
                Double poolArea = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập số tầng: ");
                int numberOfFloors = Integer.parseInt(scanner.nextLine());
                Villa villa = new Villa(idVilla, nameVilla,usableArea,rentalCost,maxNumberOfPeople,
                        rentalType,roomStandard,amenitie,poolArea,numberOfFloors);
                villa.showInfor();
                villaList.add(villa);
        }
    }
    public void showServices(){
        System.out.println("1.\tShow all Villa\n" +
                "2.\tShow all House\n" +
                "3.\tShow all Room\n" +
                "4.\tShow all Name Villa Not Duplicate\n" +
                "5.\tShow all Name House Not Duplicate\n" +
                "6.\tShow all Name Room Not Duplicate\n" +
                "7.\tBack to menu\n" +
                "8.\tExit\n");
        Scanner scanner = new Scanner(System.in);
        int choose = Integer.parseInt(scanner.nextLine());
    }
}
