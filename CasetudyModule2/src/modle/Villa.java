package modle;

import manager.IdExistException;

import java.io.Serializable;
import java.time.LocalDate;

public class Villa extends Service implements Serializable,RentalContract{
    private int roomStandard = 5;
    private String amenitie = "Beach view";
    private double poolArea = 50;
    private int numberOfFloors = 2;
    private AcompanyingService acompanyingService;

    public Villa() {
    }

    public Villa(AcompanyingService acompanyingService) {
        this.acompanyingService = acompanyingService;
    }

//    public Villa(int roomStandard, String amenitie, double poolArea, byte numberOfFloors, AcompanyingService acompanyingService) {
//        this.roomStandard = roomStandard;
//        this.amenitie = amenitie;
//        this.poolArea = poolArea;
//        this.numberOfFloors = numberOfFloors;
//        this.acompanyingService = acompanyingService;
//    }

    public Villa(int id, String serviceName, double usableArea, double rentalCost, int maxNumberOfPeople, String rentalType, int roomStandard, String amenitie, double poolArea, int numberOfFloors, AcompanyingService acompanyingService) throws IdExistException {
        super(id, serviceName, usableArea, rentalCost, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.amenitie = amenitie;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
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

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
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
                " id=" + id +
                ", roomStandard=" + roomStandard +"*"+
                ", amenitie='" + amenitie + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxNumberOfPeople=" + maxNumberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                ", acompanyingService=" + acompanyingService +
                '}';
    }

    @Override
    public void rentalContract(int numberContract, LocalDate startDay, LocalDate endDay, double deposit, double totalPay) {
       int totalDay = (endDay.getDayOfYear()-startDay.getDayOfYear());
    }


    @Override
    public int compareTo(Service o) {
        return this.getId() - o.getId();
    }
}
