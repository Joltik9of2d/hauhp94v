package manager;

import commons.FuncWriteAndRead;
import libs.Path;
import libs.RegularExpression;
import models.*;

import java.util.*;

public class ManagerService {
    public static FuncWriteAndRead<Services> funcWriteAndReadService = new FuncWriteAndRead<>();
    public static List<Services> servicesList = funcWriteAndReadService.readDataFromFile(Path.PATH_SERVICES_CSV);
    public static List<Services> villaList = funcWriteAndReadService.readDataFromFile(Path.PATH_VILLA_CSV);
    public static List<Services> houseList = funcWriteAndReadService.readDataFromFile(Path.PATH_HOUSE_CSV);
    public static List<Services> roomList = funcWriteAndReadService.readDataFromFile(Path.PATH_ROOM_CSV);

    public static void addNewServies() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            int choose = 0;
            while (true){
                try {
                    System.out.println("1.\tAdd New Villa\n" +
                            "2.\tAdd New House\n" +
                            "3.\tAdd New Room\n" +
                            "4.\tBack to menu\n" +
                            "5.\tExit\n");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                }catch (NumberFormatException e){
                    System.err.println("Chỉ được chọn 1-5");
                }
            }
            switch (choose) {
                case 1:
                    System.out.println("Add new villa");
                    String idVilla = inputIdService();
                    String nameVilla = inputNameService();
                    String usableAreaVilla = inputUsableArea();
                    double rentalCostVilla = inputRentalCost();
                    String maxNumberOfPeople = inputMaxNumberOfPeople();
                    String rentalTypeOfVilla = inputRentalType();
                    String roomStandardVilla = inputRoomStandard();
                    String amenitieVilla = inputAmenitie();
                    String poolAreaVilla = inputPoolArea();
                    int numberOfFloorsVilla = inputNumberOfFloors();
                    Villa villa = new Villa(idVilla, nameVilla, usableAreaVilla, rentalCostVilla, maxNumberOfPeople,
                            rentalTypeOfVilla, roomStandardVilla, amenitieVilla, poolAreaVilla, numberOfFloorsVilla);
                    villa.showInfor();
                    villaList.add(villa);
                    servicesList.add(villa);
                    funcWriteAndReadService.writeToFile(Path.PATH_VILLA_CSV, villaList);
                    funcWriteAndReadService.writeToFile(Path.PATH_SERVICES_CSV, servicesList);
                    break;
                case 2:
                    System.out.println("Add new house");
                    String idHouse = inputIdService();
                    String nameHouse = inputNameService();
                    String usableAreaHouse = inputUsableArea();
                    double rentalCostHouse = inputRentalCost();
                    String maxNumberOfPeopleHouse = inputMaxNumberOfPeople();
                    String rentalTypeHouse = inputRentalType();
                    String roomStandardHouse = inputRoomStandard();
                    String amenitieHouse = inputAmenitie();
                    int numberOfFloorsHouse=inputNumberOfFloors();
                    House house = new House(idHouse, nameHouse, usableAreaHouse, rentalCostHouse, maxNumberOfPeopleHouse,
                            rentalTypeHouse, roomStandardHouse, amenitieHouse, numberOfFloorsHouse);
                    house.showInfor();
                    houseList.add(house);
                    servicesList.add(house);
                    funcWriteAndReadService.writeToFile(Path.PATH_HOUSE_CSV, houseList);
                    funcWriteAndReadService.writeToFile(Path.PATH_SERVICES_CSV, servicesList);
                    break;
                case 3:
                    System.out.println("Add new room");
                    String idRoom = inputIdService();
                    String nameRoom = inputNameService();
                    String usableAreaRoom = inputUsableArea();
                    double rentalCostRoom = inputRentalCost();
                    String maxNumberOfPeopleRoom = inputMaxNumberOfPeople();
                    String rentalTypeRoom = inputRentalType();
                    System.out.println("Nhập dịch vụ miễn phí đi kèm: ");
                    String freeServiceRoom = scanner.nextLine();
                    Room room = new Room(idRoom, nameRoom, usableAreaRoom, rentalCostRoom, maxNumberOfPeopleRoom,
                            rentalTypeRoom, freeServiceRoom);
                    room.showInfor();
                    roomList.add(room);
                    servicesList.add(room);
                    funcWriteAndReadService.writeToFile(Path.PATH_ROOM_CSV, roomList);
                    funcWriteAndReadService.writeToFile(Path.PATH_SERVICES_CSV, servicesList);
                    break;
                case 4:
                    check = false;
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình");
                    System.exit(0);
                default:
                    System.out.println("chọn không đúng, chọn lại");
                    break;
            }
        }
    }

    private static int inputNumberOfFloors() {
        int numberOfFloors = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Nhập số tầng: ");
                numberOfFloors = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return numberOfFloors;
    }

    private static String inputPoolArea() {
        String poolArea = "";
        Scanner scanner = new Scanner(System.in);
        while (!RegularExpression.validateUsablePool(poolArea)) {
            System.out.println("Nhập diện tích hồ bơi (>30): ");
            poolArea = scanner.nextLine();
        }
        return poolArea;
    }

    private static String inputAmenitie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tiện nghi khác: ");
        return scanner.nextLine();
    }

    private static String inputRoomStandard() {
        String roomStandard = "";
        Scanner scanner1 = new Scanner(System.in);
        while (!RegularExpression.validateRoomStandard(roomStandard)) {
            System.out.print("Nhập tiêu chuẩn phòng (1*-5*): ");
            roomStandard = scanner1.nextLine();
        }
        return roomStandard;
    }

    private static String inputRentalType() {
        String rentalType = "";
        Scanner scanner = new Scanner(System.in);
        while (!RegularExpression.validateRentalType(rentalType)) {
            System.out.print("Nhập kiểu thuê (Gio, Ngay, Thang, Nam): ");
            rentalType = scanner.nextLine();
        }
        return rentalType;
    }

    private static String inputMaxNumberOfPeople() {
        String maxNumberOfPeople = "";
        Scanner scanner = new Scanner(System.in);
        while (!RegularExpression.validateMaxOfPeople(maxNumberOfPeople)) {
            System.out.print("Nhập số người tối đa: ");
            maxNumberOfPeople = scanner.nextLine();
        }
        return maxNumberOfPeople;
    }

    private static double inputRentalCost() {
        double rentalCost = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhập chi phí thuê(triệu): ");
                rentalCost = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng");
            }
        }
        return rentalCost;
    }

    private static String inputUsableArea() {
        String usableArea = "";
        Scanner scanner = new Scanner(System.in);
        while (!RegularExpression.validateUsablePool(usableArea)) {
            System.out.print("Nhập diện tích sử dụng (>30) mét vuông: ");
            usableArea = scanner.nextLine();
        }
        return usableArea;
    }

    private static String inputNameService() {
        String nameService = "";
        Scanner scanner = new Scanner(System.in);
        while (!RegularExpression.validateNameService(nameService)) {
            System.out.print("Nhập tên service (Villa/House/Room...): ");
            nameService = scanner.nextLine();
        }
        return nameService;
    }

    private static String inputIdService() {
        String idService = "";
        Scanner scanner = new Scanner(System.in);
        while (!RegularExpression.validateIdService(idService) || searchServiceById(idService)) {
            System.out.print("Nhập id service (SVVL-1234) : ");
            idService = scanner.nextLine();
        }
        return idService;
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
                        for (Services services : villaList) {
                            System.out.println(services.showInfor());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("Hiển thị danh sách house từ file: ");
                    try {
                        for (Services services : houseList) {
                            System.out.println(services.showInfor());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Hiển thị danh sách room từ file: ");
                    try {
                        for (Services services : roomList) {
                            System.out.println(services.showInfor());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    System.out.println("Hiển thị danh sách tên villa từ file (tên không trùng nhau");
                    TreeSet<String> villaTreeSet = new TreeSet<>();
                    try {
                        for (Services services : villaList) {
                            villaTreeSet.add(services.getServiceName());
                        }
                        for (String treeSet : villaTreeSet) {
                            System.out.println(treeSet);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    System.out.println("Hiển thị danh sách tên house từ file (tên không trùng nhau");
                    TreeSet<String> houseTreeSet = new TreeSet<>();
                    try {
                        for (Services services : houseList) {
                            houseTreeSet.add(services.getServiceName());
                        }
                        for (String treeSet : houseTreeSet) {
                            System.out.println(treeSet);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    System.out.println("Hiển thị danh sách tên room từ file (tên không trùng nhau");
                    TreeSet<String> roomTreeSet = new TreeSet<>();
                    try {
                        for (Services services : roomList) {
                            roomTreeSet.add(services.getServiceName());
                        }
                        for (String treeSet : roomTreeSet) {
                            System.out.println(treeSet);
                        }
                    } catch (Exception e) {
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

    public static boolean searchServiceById(String id) {
        for (Services services : servicesList) {
            if (services.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public static void removeServiceById() {
        System.out.print("Nhập id service cần xóa: ");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        while (!searchServiceById(id)) {
            System.out.print("id không tồn tại, nhập lại: ");
            id = scanner.nextLine();
        }
        System.out.println("Bạn có chắc chắn muốn xóa id " + id + " yes hoặc no: ");
        String choose = scanner.nextLine();
        if (choose.equals("no")) {
            System.out.println("ok, không xóa nữa");
            return;
        }
        for (Services services : servicesList) {
            if (services.getId().equals(id)) {
                servicesList.remove(services);
                break;
            }
        }
        for (Services villa : villaList) {
            if (villa.getId().equals(id)) {
                villaList.remove(villa);
                break;
            }
        }
        for (Services house : houseList) {
            if (house.getId().equals(id)) {
                houseList.remove(house);
                break;
            }
        }
        for (Services room : roomList) {
            if (room.getId().equals(id)) {
                servicesList.remove(room);
                break;
            }
        }
        funcWriteAndReadService.writeToFile(Path.PATH_SERVICES_CSV, servicesList);
        funcWriteAndReadService.writeToFile(Path.PATH_VILLA_CSV, villaList);
        funcWriteAndReadService.writeToFile(Path.PATH_HOUSE_CSV, houseList);
        funcWriteAndReadService.writeToFile(Path.PATH_ROOM_CSV, roomList);
        System.out.println("Đã xóa xong id " + id);
    }
    public static void searchServiceByIdToShow(){
        String id = inputIdService();
        for (Services services: servicesList){
            if(services.getId().equals(id)){
                System.out.println("Đã tìm thấy service "+id);
                System.out.println(services.showInfor());
                return;
            }
        }
        System.out.println("Không tìm thấy service này");
    }
    public static void searchServiceByNameToShow() {
        String name = inputNameService();
        for (Services services: servicesList){
            if(services.getServiceName().equals(name)){
                System.out.println("Đã tìm thấy tên service "+name);
                System.out.println(services.showInfor());
                return;
            }
        }
        System.out.println("Không tìm thấy service này");
    }

    }
