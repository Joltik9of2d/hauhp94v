package manager;

import common.FuncWriteRead;
import modle.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManagerService {
    List<Service> serviceList = new ArrayList<>();
    List<Service> villaList = new ArrayList<>();
    List<Service> houseList = new ArrayList<>();
    List<Service> roomList = new ArrayList<>();
    public void addService() throws IdExistException {
        FuncWriteRead<Service> funcWriteRead = new FuncWriteRead<>();
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Chọn dịch vụ: \n1.Villa \n2.House \n3.Room \n4.Hiển thị danh sách service từ file\n5.Thoát");
                int chooseService = scanner.nextInt();
                switch (chooseService) {
                    case 1:
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.print("Nhập idVilla: ");
                        int idVilla = Integer.parseInt(scanner1.nextLine());
                        System.out.print("Nhập số lượng người tối đa: ");
                        int maxPeople = Integer.parseInt(scanner1.nextLine());
                        String rentalType = getRentalType();
                        AcompanyingService acompanyingService = orderAcompanyingService();
                        Villa villa = new Villa(idVilla,"Villa",300,2500000,maxPeople,rentalType,5,"Beach view",50, 2,acompanyingService);
                        System.out.println(villa.toString());
                        this.serviceList.add(villa);
                        villaList.add(villa);
                        funcWriteRead.writeToFile("D:\\C0321G1_HuynhPhuocHau_Module2\\src\\CasetudyModule2\\src\\data\\villa.csv",villaList);
                        funcWriteRead.writeToFile("D:\\C0321G1_HuynhPhuocHau_Module2\\src\\CasetudyModule2\\src\\data\\service.csv", this.serviceList);
                        break;
                    case 2:
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.print("Nhập idHouse: ");
                        int idHouse = Integer.parseInt(scanner2.nextLine());
                        System.out.print("Nhập số lượng người tối đa: ");
                        int maxPeopleHouse = Integer.parseInt(scanner2.nextLine());
                        String rentalTypeHouse = getRentalType();
                        AcompanyingService acompanyingServiceHouse = orderAcompanyingService();
                        House house = new House(idHouse,"House",1,1500000,maxPeopleHouse,rentalTypeHouse,3,"Forest view", 1,acompanyingServiceHouse);
                        System.out.println(house.toString());
                        this.serviceList.add(house);
                        houseList.add(house);
                        funcWriteRead.writeToFile("D:\\C0321G1_HuynhPhuocHau_Module2\\src\\CasetudyModule2\\src\\data\\house.csv",houseList);
                        funcWriteRead.writeToFile("D:\\C0321G1_HuynhPhuocHau_Module2\\src\\CasetudyModule2\\src\\data\\service.csv", this.serviceList);
                        break;
                    case 3:
                        Scanner scanner3 = new Scanner(System.in);
                        System.out.print("Nhập idRoom: ");
                        int idRoom = Integer.parseInt(scanner3.nextLine());
                        System.out.print("Nhập số lượng người tối đa: ");
                        int maxPeopleRoom = Integer.parseInt(scanner3.nextLine());
                        String rentalTypeRoom = getRentalType();
                        String freeService = "Bữa sáng miễn phí";
                        AcompanyingService acompanyingServiceRoom = orderAcompanyingService();
                        Room room = new Room(idRoom, "Room", 100, 500000, maxPeopleRoom, rentalTypeRoom, freeService, acompanyingServiceRoom);
                        System.out.println(room.toString());
                        this.serviceList.add(room);
                        roomList.add(room);
                        funcWriteRead.writeToFile("D:\\C0321G1_HuynhPhuocHau_Module2\\src\\CasetudyModule2\\src\\data\\room.csv",roomList);
                        funcWriteRead.writeToFile("D:\\C0321G1_HuynhPhuocHau_Module2\\src\\CasetudyModule2\\src\\data\\service.csv", this.serviceList);
                        break;
                    case 4:
                        System.out.println("Hiển thị danh sách service từ file: ");
                        List<Service> serviceList = funcWriteRead.readDataFromFile("D:\\C0321G1_HuynhPhuocHau_Module2\\src\\CasetudyModule2\\src\\data\\service.csv");
                        Collections.sort(serviceList,new ComparatorByIdService());
                        for (Service service : serviceList){
                            System.out.println(service);
                        }
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Nhập 1-3");
                        break;
                }
            }
            catch (IdExistException e){
                System.err.println(e.getMessage());
            }
            catch (Exception e) {
                System.out.println("Vui lòng nhập đúng định dạng, nhập lại");
            }
        }
    }

    public static AcompanyingService orderAcompanyingService() {
        Scanner scanner1 = new Scanner(System.in);
        int unitMassage = 0;
        int unitKaraoke = 0;
        int unitFood = 0;
        int unitDrinking = 0;
        int unitRentCar = 0;
        boolean check = true;
        while (check) {
            System.out.println("Chọn dịch vụ đi kèm: \n1. Massage (200k) \n2. Karaoke (400k) \n3. Food (300k) \n4. Drinking (100k) \n5. Rent car (600k) \n6. Thoát ");
            int choose = 0;
            try {
                choose = Integer.parseInt(scanner1.nextLine());
            } catch (Exception e) {
                System.out.println("Nhập lại");
            }
          try {
              switch (choose) {
                  case 1:
                      System.out.println("Massage 200k 1 lần");
                      System.out.print("Nhập số lần massage: ");
                      unitMassage = Integer.parseInt(scanner1.nextLine());
                      break;
                  case 2:
                      System.out.println("Karaoke 400k 1 lần");
                      System.out.print("Nhập số lần hát karaoke: ");
                      unitKaraoke = Integer.parseInt(scanner1.nextLine());
                      break;
                  case 3:
                      System.out.println("Đặt thức ăn 300k 1 lần");
                      System.out.print("Nhập số lần đặt thức ăn: ");
                      unitFood = Integer.parseInt(scanner1.nextLine());
                      break;
                  case 4:
                      System.out.println("Đặt đồ uống 100k 1 lần");
                      System.out.print("Nhập số lần đặt đồ uống: ");
                      unitDrinking = Integer.parseInt(scanner1.nextLine());
                      break;
                  case 5:
                      System.out.println("Thuê xe 600k 1 ngày");
                      System.out.print("Nhập số ngày thuê xe: ");
                      unitRentCar = Integer.parseInt(scanner1.nextLine());
                      break;
                  case 6:
                      check = false;
                      break;
                  default:
                      System.out.println("Nhập lại");
              }
          }catch (Exception e){
              System.out.println("Lỗi nhập liệu");
          }
        }
        AcompanyingService acompanyingService = new AcompanyingService(unitMassage, unitDrinking, unitFood, unitKaraoke, unitRentCar);
        return acompanyingService;
    }

    public static String getRentalType() {
        String rentalType = null;
        while (true) {
            System.out.println("Chọn kiểu thuê: \n1. Thuê theo ngày \n2. Thuê theo tháng \n3. Thuê theo năm ");
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    return rentalType = "Thuê theo ngày";
                case 2:
                    return rentalType = "Thuê theo tháng";
                case 3:
                    return rentalType = "Thuê theo năm";
                default:
                    System.out.println("Nhập lại:");
            }
        }
    }
}
