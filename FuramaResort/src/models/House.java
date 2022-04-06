package models;

public class House extends Services{
    private int roomStandard = 3;
    private String amenitie = "forest view";
    private int numberOfFloors = 1;

    public House() {
    }

    public House(int roomStandard, String amenitie, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.amenitie = amenitie;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String id, String serviceName, double usableArea, double rentalCost, int maxNumberOfPeople, String rentalType, int roomStandard, String amenitie, int numberOfFloors) {
        super(id, serviceName, usableArea, rentalCost, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.amenitie = amenitie;
        this.numberOfFloors = numberOfFloors;
    }

    public int getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(int roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getAmenitie() {
        return amenitie;
    }

    public void setAmenitie(String amenitie) {
        this.amenitie = amenitie;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    @Override
    public String showInfor() {
        return "House{" +
                "roomStandard=" + roomStandard +
                ", numberOfFloors=" + numberOfFloors +
                ", id='" + id + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxNumberOfPeople=" + maxNumberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
