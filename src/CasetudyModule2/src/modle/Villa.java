package modle;

import java.time.LocalDate;

public class Villa extends Service implements RentalContract{
    private int roomStandard = 5;
    private String amenitie = "Beach view";
    private double poolArea = 300;
    private byte numberOfFloors = 2;
    private AcompanyingService acompanyingService;

    public Villa(String serviceName, double usableArea, double rentalCost, int maxNumberOfPeople, String rentalType, AcompanyingService acompanyingService) {
        super(serviceName, usableArea, rentalCost, maxNumberOfPeople, rentalType);
        this.acompanyingService = acompanyingService;
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

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public byte getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(byte numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public AcompanyingService getAcompanyingService() {
        return acompanyingService;
    }

    public void setAcompanyingService(AcompanyingService acompanyingService) {
        this.acompanyingService = acompanyingService;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + "*"+'\'' +
                ", amenitie='" + amenitie + '\'' +
                ", poolArea=" + poolArea +"met vuông"+
                ", numberOfFloors=" + numberOfFloors +" Tầng"+
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +" met vuông"+
                ", rentalCost=" + rentalCost + " triệu VND"+
                ", maxNumberOfPeople=" + maxNumberOfPeople +" Người"+
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    @Override
    public void rentalContract(int numberContract, LocalDate startDay, LocalDate endDay, double deposit, double totalPay) {
       int totalDay = (endDay.getDayOfYear()-startDay.getDayOfYear());
       

    }
}
