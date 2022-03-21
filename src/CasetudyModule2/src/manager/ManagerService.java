package manager;

import modle.AcompanyingService;
import modle.Service;
import modle.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerService {
    List<Service> serviceList = new ArrayList<>();
    public void addService(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn dịch vụ: \n1.Villa \n2.House \n3.Room ");
        int luaChon = scanner.nextInt();
        switch (luaChon){
            case 1:
                Scanner scanner1 = new Scanner(System.in);
                String nameVilla = "VIPVilla";
                double usableArea = 300;
                double rentalCost = 2.5;
                String amenitie = "Beach view";
                System.out.print("Nhập số lượng người tối đa: ");
                int maxPeople = Integer.parseInt(scanner1.nextLine());
                System.out.print("Kiểu thuê (ngay, thang, nam) : ");
                String rentalType = scanner1.nextLine();
                double poolArea = 20;
                byte numberOfFloors = 2;
                AcompanyingService acompanyingService=new AcompanyingService();
        }
    }
}
