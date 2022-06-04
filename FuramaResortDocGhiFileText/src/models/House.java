package models;

public class House extends Services{
    private String roomStandard;
    private String amenitie;
    private int numberOfFloors;

    public House() {
    }

    public House(String roomStandard, String amenitie, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.amenitie = amenitie;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String id, String serviceName, String usableArea, double rentalCost, String maxNumberOfPeople,
                 String rentalType, String roomStandard, String amenitie, int numberOfFloors) {
        super(id, serviceName, usableArea, rentalCost, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.amenitie = amenitie;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
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
                " id='" + id + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", roomStandard=" + roomStandard +
                ", numberOfFloors=" + numberOfFloors +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +" Triệu"+
                ", maxNumberOfPeople=" + maxNumberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return super.toString()+
                ","+ roomStandard +
                ","+ amenitie +
                ","+ numberOfFloors ;
    }
}
