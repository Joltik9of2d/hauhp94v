package manager;

import commons.FuncWriteAndRead;
import libs.RegularExpression;
import models.*;

import java.io.IOException;
import java.util.*;

public class ManagerService {
    public static final String PATH_VILLA_CSV = "D:\\C0321G1_HuynhPhuocHau_Module2\\FuramaResort\\src\\data\\Villa.csv";
    public static final String PATH_HOUSE_CSV = "D:\\C0321G1_HuynhPhuocHau_Module2\\FuramaResort\\src\\data\\House.csv";
    public static final String PATH_ROOM_CSV = "D:\\C0321G1_HuynhPhuocHau_Module2\\FuramaResort\\src\\data\\Room.csv";
    public static final String PATH_SERVICES_CSV = "D:\\C0321G1_HuynhPhuocHau_Module2\\FuramaResort\\src\\data\\Services.csv";
    public static FuncWriteAndRead<Services> funcWriteAndReadService = new FuncWriteAndRead<>();
    public static FuncWriteAndRead<Services> funcWriteAndReadVilla = new FuncWriteAndRead<>();
    public static FuncWriteAndRead<Services> funcWriteAndReadHouse = new FuncWriteAndRead<>();
    public static FuncWriteAndRead<Services> funcWriteAndReadRoom = new FuncWriteAndRead<>();
    public static List<Services> servicesList = funcWriteAndReadService.readDataFromFile(PATH_SERVICES_CSV);
    public static List<Services> villaList = funcWriteAndReadVilla.readDataFromFile(PATH_VILLA_CSV);
    public static List<Services> houseList = funcWriteAndReadHouse.readDataFromFile(PATH_HOUSE_CSV);
    public static List<Services> roomList = funcWriteAndReadRoom.readDataFromFile(PATH_ROOM_CSV);
    public static void addNewServies() {
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
                    System.out.println("Add new villa");
                    String idVilla = "";
                    while (!RegularExpression.validateIdService(idVilla) || searchServiceById(idVilla)) {
                        System.out.print("Nhập id villa (SVVL-1234) : ");
                        idVilla = scanner.nextLine();
                    }
                    String nameVilla = "";
                    while (!RegularExpression.validateNameService(nameVilla)) {
                        System.out.print("Nhập tên villa (Villa): ");
                        nameVilla = scanner.nextLine();
                    }
                    String usableArea = "";
                    while (!RegularExpression.validateUsablePool(usableArea)) {
                        System.out.print("Nhập diện tích sử dụng (>30) mét vuông: ");
                        usableArea = scanner.nextLine();
                    }
                    double rentalCost;
                    while (true) {
                        try {
                            System.out.print("Nhập chi phí thuê: ");
                            rentalCost = Double.parseDouble(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Sai định dạng");
                        }
                    }
                    String maxNumberOfPeople = "";
                    while (!RegularExpression.validateMaxOfPeople(maxNumberOfPeople)) {
                            System.out.print("Nhập số người tối đa: ");
                            maxNumberOfPeople = scanner.nextLine();
                    }
                    String rentalType = "";
                    while(!RegularExpression.validateRentalType(rentalType)) {
                        System.out.print("Nhập kiểu thuê (Gio, Ngay, Thang, Nam): ");
                        rentalType = scanner.nextLine();
                    }
                    String roomStandard = "";
                    while (!RegularExpression.validateRoomStandard(roomStandard)) {
                        System.out.print("Nhập tiêu chuẩn phòng (1*-5*): ");
                        roomStandard = scanner.nextLine();
                    }
                    System.out.println("Nhập tiện nghi khác: ");
                    String amenitie = scanner.nextLine();
                    String poolArea="";
                   while (!RegularExpression.validateUsablePool(poolArea)){
                       System.out.println("Nhập diện tích hồ bơi (>30): ");
                        poolArea = scanner.nextLine();
                   }
                    int numberOfFloors=0;
                    while (true){
                       try{
                           System.out.println("Nhập số tầng: ");
                           numberOfFloors = Integer.parseInt(scanner.nextLine());
                           break;
                       }catch (NumberFormatException e){
                           e.printStackTrace();
                       }
                    }
                    Villa villa = new Villa(idVilla, nameVilla, usableArea, rentalCost, maxNumberOfPeople,
                            rentalType, roomStandard, amenitie, poolArea, numberOfFloors);
                    villa.showInfor();
                    villaList.add(villa);
                    servicesList.add(villa);
                    FuncWriteAndRead<Services> funcWriteAndReadVilla = new FuncWriteAndRead<>();
                    funcWriteAndReadVilla.writeToFile(PATH_VILLA_CSV, villaList);
                    funcWriteAndReadVilla.writeToFile(PATH_SERVICES_CSV, servicesList);
                    break;
                case 2:
                    System.out.println("Add new house");
                    String idHouse = "";
                   while (!RegularExpression.validateIdService(idHouse) || searchServiceById(idHouse)){
                       System.out.print("Nhập id house (SVHO-1234) : ");
                       idHouse = scanner.nextLine();
                   }
                    String nameHouse = "";
                    while (!RegularExpression.validateNameService(nameHouse)){
                        System.out.print("Nhập tên house (House): ");
                        nameHouse = scanner.nextLine();
                    }
                    String usableAreaHouse = "";
                   while (!RegularExpression.validateUsablePool(usableAreaHouse)){
                       System.out.print("Nhập diện tích sử dụng (>30) mét vuông: ");
                        usableAreaHouse = scanner.nextLine();
                   }
                    double rentalCostHouse = 0;
                  while (true){
                      try {
                          System.out.print("Nhập chi phí thuê: ");
                          rentalCostHouse = Double.parseDouble(scanner.nextLine());
                          break;
                      }catch (NumberFormatException e){
                          e.printStackTrace();
                      }
                  }
                    String maxNumberOfPeopleHouse = "";
                    while (!RegularExpression.validateMaxOfPeople(maxNumberOfPeopleHouse)){
                            System.out.print("Nhập số người tối đa: ");
                            maxNumberOfPeopleHouse = scanner.nextLine();
                    }
                    String rentalTypeHouse = "";
                    while (!RegularExpression.validateRentalType(rentalTypeHouse)){
                        System.out.print("Nhập kiểu thuê (Gio, Ngay, Thang, Nam): ");
                        rentalTypeHouse = scanner.nextLine();
                    }
                    String roomStandardHouse = "";
                    while (!RegularExpression.validateRoomStandard(roomStandardHouse)){
                        System.out.print("Nhập tiêu chuẩn phòng (1*-5*): ");
                         roomStandardHouse = scanner.nextLine();
                    }
                    System.out.println("Nhập tiện nghi khác: ");
                    String amenitieHouse = scanner.nextLine();
                    int numberOfFloorsHouse;
                    while (true){
                        try {
                            System.out.println("Nhập số tầng: ");
                             numberOfFloorsHouse = Integer.parseInt(scanner.nextLine());
                             break;
                        }catch (NumberFormatException e){
                            e.printStackTrace();
                        }
                    }
                    House house = new House(idHouse, nameHouse, usableAreaHouse, rentalCostHouse, maxNumberOfPeopleHouse,
                            rentalTypeHouse, roomStandardHouse, amenitieHouse, numberOfFloorsHouse);
                    house.showInfor();
                    houseList.add(house);
                    servicesList.add(house);
                    FuncWriteAndRead<Services> funcWriteAndReadHouse = new FuncWriteAndRead<>();
                    funcWriteAndReadHouse.writeToFile(PATH_HOUSE_CSV, houseList);
                    funcWriteAndReadHouse.writeToFile(PATH_SERVICES_CSV, servicesList);
                    break;
                case 3:
                    System.out.println("Add new room");
                    String idRoom = "";
                    while (!RegularExpression.validateIdService(idRoom) || searchServiceById(idRoom)){
                        System.out.print("Nhập id room (SVRO-1234) : ");
                        idRoom = scanner.nextLine();
                    }
                    String nameRoom = "";
                    while (!RegularExpression.validateNameService(nameRoom)){
                        System.out.print("Nhập tên room (Room): ");
                        nameRoom = scanner.nextLine();
                    }
                    String usableAreaRoom= "";
                    while (!RegularExpression.validateUsablePool(usableAreaRoom)){
                        System.out.print("Nhập diện tích sử dụng (>30) mét vuông: ");
                       usableAreaRoom =scanner.nextLine();
                    }
                    double rentalCostRoom=0;
                    while (true){
                        try{
                            System.out.print("Nhập chi phí thuê: ");
                            rentalCostRoom = Double.parseDouble(scanner.nextLine());
                            break;
                        }catch (NumberFormatException e){
                            e.printStackTrace();
                        }
                    }
                    String maxNumberOfPeopleRoom = "";
                    while (!RegularExpression.validateMaxOfPeople(maxNumberOfPeopleRoom)){
                            System.out.print("Nhập số người tối đa: ");
                           maxNumberOfPeopleRoom = scanner.nextLine();

                    }
                    String rentalTypeRoom = "";
                    while (!RegularExpression.validateRentalType(rentalTypeRoom)){
                        System.out.print("Nhập kiểu thuê (Gio, Ngay, Thang, Nam): ");
                        rentalTypeRoom = scanner.nextLine();
                    }
                    System.out.println("Nhập dịch vụ miễn phí đi kèm: ");
                    String freeServiceRoom = scanner.nextLine();
                    Room room = new Room(idRoom, nameRoom, usableAreaRoom, rentalCostRoom, maxNumberOfPeopleRoom,
                            rentalTypeRoom, freeServiceRoom);
                    room.showInfor();
                    roomList.add(room);
                    servicesList.add(room);
                    FuncWriteAndRead<Services> funcWriteAndReadRoom = new FuncWriteAndRead<>();
                    funcWriteAndReadRoom.writeToFile(PATH_ROOM_CSV, roomList);
                    funcWriteAndReadRoom.writeToFile(PATH_SERVICES_CSV, servicesList);
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
                   try {
                       List<Services> servicesListVilla = funcWriteAndRead.readDataFromFile(PATH_VILLA_CSV);
                       for (Services services : servicesListVilla) {
                           System.out.println(services.showInfor());
                       }
                   }catch (Exception e){
                       e.printStackTrace();
                   }
                    break;
                case 2:
                    System.out.println("Hiển thị danh sách house từ file: ");
                   try {
                       List<Services> servicesListHouse = funcWriteAndRead.readDataFromFile(PATH_HOUSE_CSV);
                       for (Services services : servicesListHouse) {
                           System.out.println(services.showInfor());
                       }
                   }catch (Exception e){
                       e.printStackTrace();
                   }
                    break;
                case 3:
                    System.out.println("Hiển thị danh sách room từ file: ");
                   try{
                       List<Services> servicesListRoom = funcWriteAndRead.readDataFromFile(PATH_ROOM_CSV);
                       for (Services services : servicesListRoom) {
                           System.out.println(services.showInfor());
                       }
                   }catch (Exception e){
                       e.printStackTrace();
                   }
                    break;
                case 4:
                    System.out.println("Hiển thị danh sách tên villa từ file (tên không trùng nhau");
                    TreeSet<String> villaTreeSet = new TreeSet<>();
                 try {
                     List<Services> servicesListVillaToSet = funcWriteAndRead.readDataFromFile(PATH_VILLA_CSV);
                     for (Services services : servicesListVillaToSet) {
                         villaTreeSet.add(services.getServiceName());
                     }
                     for (String treeSet : villaTreeSet) {
                         System.out.println(treeSet);
                     }
                 }catch (Exception e){
                     e.printStackTrace();
                 }
                    break;
                case 5:
                    System.out.println("Hiển thị danh sách tên house từ file (tên không trùng nhau");
                    TreeSet<String> houseTreeSet = new TreeSet<>();
                  try{
                      List<Services> servicesListHouseToSet = funcWriteAndRead.readDataFromFile(PATH_HOUSE_CSV);
                      for (Services services : servicesListHouseToSet) {
                          houseTreeSet.add(services.getServiceName());
                      }
                      for (String treeSet : houseTreeSet) {
                          System.out.println(treeSet);
                      }
                  }catch (Exception e){
                      e.printStackTrace();
                  }
                    break;
                case 6:
                    System.out.println("Hiển thị danh sách tên room từ file (tên không trùng nhau");
                    TreeSet<String> roomTreeSet = new TreeSet<>();
                  try {
                      List<Services> servicesListRoomToSet = funcWriteAndRead.readDataFromFile(PATH_ROOM_CSV);
                      for (Services services : servicesListRoomToSet) {
                          roomTreeSet.add(services.getServiceName());
                      }
                      for (String treeSet : roomTreeSet) {
                          System.out.println(treeSet);
                      }
                  }catch (Exception e){
                      e.printStackTrace();
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

    public static Queue<Customer> veXemPhimQueue = new ArrayDeque<>();
    
    public static void muaVeXemPhim() {
        Customer customer1 = new Customer("CU-0001", "Huỳnh văn A");
        Customer customer2 = new Customer("CU-0004", "Nguyễn An");
        Customer customer3 = new Customer("CU-0012", "Đinh Lễ");
        Customer customer4 = new Customer("CU-1043", "Lê Văn Xuân");
        Customer customer5 = new Customer("CU-0221", "Võ Lâm");
        veXemPhimQueue.add(customer1);
        veXemPhimQueue.add(customer2);
        veXemPhimQueue.add(customer3);
        veXemPhimQueue.add(customer4);
        veXemPhimQueue.add(customer5);
        if (veXemPhimQueue.size() == 5) {
            System.out.println("Đã đủ 5 vé, Danh sách khách hàng: ");
            for (Customer customer : veXemPhimQueue) {
                System.out.println(customer.getIdCustomer() + " Tên: " + customer.getCustomerName());
            }
        }
    }

    public static void showCinema4DTicket() {
        muaVeXemPhim();
        System.out.println("Danh sách khách hàng in theo thứ tự mua vé: ");
        while (!veXemPhimQueue.isEmpty()) {
                System.out.println(veXemPhimQueue.poll().getCustomerName());
        }

    }
    public static boolean searchServiceById(String id){
        for(Services services: servicesList){
            if(services.getId().equals(id)){
                return true;
            }
        }
        return false;
    }
    public static void removeServiceById(){
        System.out.print("Nhập id service cần xóa: ");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        while (!searchServiceById(id)){
            System.out.print("id không tồn tại, nhập lại: " );
            id = scanner.nextLine();
        }
        System.out.println("Bạn có chắc chắn muốn xóa id "+ id + " yes hoặc no: ");
        String choose = scanner.nextLine();
        if(choose.equals("no")){
            System.out.println("ok, không xóa nữa");
            return;
        }
        for(Services services: servicesList){
            if(services.getId().equals(id)){
                servicesList.remove(services);
                break;
            }
        }
        for(Services villa: villaList){
            if(villa.getId().equals(id)){
                villaList.remove(villa);
                break;
            }
        } for(Services house: houseList){
            if(house.getId().equals(id)){
                houseList.remove(house);
                break;
            }
        } for(Services room: roomList){
            if(room.getId().equals(id)){
                servicesList.remove(room);
                break;
            }
        }
        funcWriteAndReadService.writeToFile(PATH_SERVICES_CSV, servicesList);
        funcWriteAndReadService.writeToFile(PATH_VILLA_CSV, villaList);
        funcWriteAndReadService.writeToFile(PATH_HOUSE_CSV, houseList);
        funcWriteAndReadService.writeToFile(PATH_ROOM_CSV, roomList);
        System.out.println("Đã xóa xong id "+id);
    }
}
