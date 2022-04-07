package manager;

import commons.FuncWriteAndRead;
import models.House;
import models.Room;
import models.Services;
import models.Villa;

import java.util.*;

public class ManagerService {
    public static final String PATH_VILLA_CSV = "D:\\C0321G1_HuynhPhuocHau_Module2\\FuramaResort\\src\\data\\Villa.csv";
    public static final String PATH_HOUSE_CSV = "D:\\C0321G1_HuynhPhuocHau_Module2\\FuramaResort\\src\\data\\House.csv";
    public static final String PATH_ROOM_CSV = "D:\\C0321G1_HuynhPhuocHau_Module2\\FuramaResort\\src\\data\\Room.csv";
    public static final String PATH_SERVICES_CSV = "D:\\C0321G1_HuynhPhuocHau_Module2\\FuramaResort\\src\\data\\Services.csv";

    public static void addNewServies() {
        List<Services> servicesList = new ArrayList<>();
        List<Services> villaList = new ArrayList<>();
        List<Services> houseList = new ArrayList<>();
        List<Services> roomList = new ArrayList<>();
        boolean check = true;
        while (check) {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
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
                    Villa villa = new Villa(idVilla, nameVilla, usableArea, rentalCost, maxNumberOfPeople,
                            rentalType, roomStandard, amenitie, poolArea, numberOfFloors);
                    villa.showInfor();
                    villaList.add(villa);
                    servicesList.add(villa);
                    FuncWriteAndRead<Services> funcWriteAndReadVilla = new FuncWriteAndRead<>();
                    funcWriteAndReadVilla.writeToFile(PATH_VILLA_CSV, villaList);
                    funcWriteAndReadVilla.writeToFile(PATH_SERVICES_CSV, villaList);
                    break;
                case 2:
                    System.out.print("Nhập id house (SVHO-1234) : ");
                    String idHouse = scanner.nextLine();
                    System.out.print("Nhập tên house (House): ");
                    String nameHouse = scanner.nextLine();
                    System.out.print("Nhập diện tích sử dụng (>30) mét vuông: ");
                    double usableAreaHouse = Double.parseDouble(scanner.nextLine());
                    System.out.print("Nhập chi phí thuê: ");
                    double rentalCostHouse = Double.parseDouble(scanner.nextLine());
                    System.out.print("Nhập số người tối đa: ");
                    int maxNumberOfPeopleHouse = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập kiểu thuê (Gio, Ngay, Thang, Nam): ");
                    String rentalTypeHouse = scanner.nextLine();
                    System.out.print("Nhập tiêu chuẩn phòng (1*-5*): ");
                    String roomStandardHouse = scanner.nextLine();
                    System.out.println("Nhập tiện nghi khác: ");
                    String amenitieHouse = scanner.nextLine();
                    System.out.println("Nhập số tầng: ");
                    int numberOfFloorsHouse = Integer.parseInt(scanner.nextLine());
                    House house = new House(idHouse, nameHouse, usableAreaHouse, rentalCostHouse, maxNumberOfPeopleHouse,
                            rentalTypeHouse, roomStandardHouse, amenitieHouse, numberOfFloorsHouse);
                    house.showInfor();
                    houseList.add(house);
                    servicesList.add(house);
                    FuncWriteAndRead<Services> funcWriteAndReadHouse = new FuncWriteAndRead<>();
                    funcWriteAndReadHouse.writeToFile(PATH_HOUSE_CSV, villaList);
                    funcWriteAndReadHouse.writeToFile(PATH_SERVICES_CSV, villaList);
                    break;
                case 3:
                    System.out.print("Nhập id room (SVRO-1234) : ");
                    String idRoom = scanner.nextLine();
                    System.out.print("Nhập tên room (Room): ");
                    String nameRoom = scanner.nextLine();
                    System.out.print("Nhập diện tích sử dụng (>30) mét vuông: ");
                    double usableAreaRoom = Double.parseDouble(scanner.nextLine());
                    System.out.print("Nhập chi phí thuê: ");
                    double rentalCostRoom = Double.parseDouble(scanner.nextLine());
                    System.out.print("Nhập số người tối đa: ");
                    int maxNumberOfPeopleRoom = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập kiểu thuê (Gio, Ngay, Thang, Nam): ");
                    String rentalTypeRoom = scanner.nextLine();
                    System.out.println("Nhập dịch vụ miễn phí đi kèm: ");
                    String freeServiceRoom = scanner.nextLine();
                    Room room = new Room(idRoom, nameRoom, usableAreaRoom, rentalCostRoom, maxNumberOfPeopleRoom,
                            rentalTypeRoom, freeServiceRoom);
                    room.showInfor();
                    roomList.add(room);
                    servicesList.add(room);
                    FuncWriteAndRead<Services> funcWriteAndReadRoom = new FuncWriteAndRead<>();
                    funcWriteAndReadRoom.writeToFile(PATH_ROOM_CSV, villaList);
                    funcWriteAndReadRoom.writeToFile(PATH_SERVICES_CSV, villaList);
                    break;
                case 4:
                    check = false;
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình");
                    System.exit(0);
            }
        }
    }

    public static void showServices() {
        FuncWriteAndRead<Services> funcWriteAndRead = new FuncWriteAndRead<>();
        while (true) {
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
            switch (choose) {
                case 1:
                    System.out.println("Hiển thị danh sách villa từ file: ");
                    List<Services> servicesListVilla = funcWriteAndRead.readDataFromFile(PATH_VILLA_CSV);
                    for (Services services : servicesListVilla) {
                        System.out.println(services);
                    }
                    break;
                case 2:
                    System.out.println("Hiển thị danh sách house từ file: ");
                    List<Services> servicesListHouse = funcWriteAndRead.readDataFromFile(PATH_HOUSE_CSV);
                    for (Services services : servicesListHouse) {
                        System.out.println(services);
                    }
                    break;
                case 3:
                    System.out.println("Hiển thị danh sách room từ file: ");
                    List<Services> servicesListRoom = funcWriteAndRead.readDataFromFile(PATH_ROOM_CSV);
                    for (Services services : servicesListRoom) {
                        System.out.println(services);
                    }
                    break;
                case 4:
                    System.out.println("Hiển thị danh sách tên villa từ file (tên không trùng nhau");
                    TreeSet<String> villaTreeSet = new TreeSet<>();
                    List<Services> servicesListVillaToSet = funcWriteAndRead.readDataFromFile(PATH_VILLA_CSV);
                    for (Services services : servicesListVillaToSet) {
                        villaTreeSet.add(services.getServiceName());
                    }
                    for (String treeSet : villaTreeSet) {
                        System.out.println(treeSet);
                    }
                    break;
                case 5:
                    System.out.println("Hiển thị danh sách tên house từ file (tên không trùng nhau");
                    TreeSet<String> houseTreeSet = new TreeSet<>();
                    List<Services> servicesListHouseToSet = funcWriteAndRead.readDataFromFile(PATH_HOUSE_CSV);
                    for (Services services : servicesListHouseToSet) {
                        houseTreeSet.add(services.getServiceName());
                    }
                    for (String treeSet : houseTreeSet) {
                        System.out.println(treeSet);
                    }
                    break;
                case 6:
                    System.out.println("Hiển thị danh sách tên room từ file (tên không trùng nhau");
                    TreeSet<String> roomTreeSet = new TreeSet<>();
                    List<Services> servicesListRoomToSet = funcWriteAndRead.readDataFromFile(PATH_ROOM_CSV);
                    for (Services services : servicesListRoomToSet) {
                        roomTreeSet.add(services.getServiceName());
                    }
                    for (String treeSet : roomTreeSet) {
                        System.out.println(treeSet);
                    }
                    break;
                case 7:
                    System.out.println("Back to menu ");
                    return;
                case 8:
                    System.exit(0);
            }
        }
    }
}
