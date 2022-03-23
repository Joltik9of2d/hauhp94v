package modle;

import manager.IdExistException;

import java.io.Serializable;
import java.time.LocalDate;

public class House extends Service implements RentalContract, Serializable {
    private int roomStandard = 3;
    private String amenitie = "forest view";
    private int numberOfFloors = 1;
    private AcompanyingService acompanyingService;

    public House() {
    }

    public House(AcompanyingService acompanyingService) {
        this.acompanyingService = acompanyingService;
    }

    public House(int roomStandard, String amenitie, int numberOfFloors, AcompanyingService acompanyingService) {
        this.roomStandard = roomStandard;
        this.amenitie = amenitie;
        this.numberOfFloors = numberOfFloors;
        this.acompanyingService = acompanyingService;
    }

    public House(int id, String serviceName, double usableArea, double rentalCost, int maxNumberOfPeople, String rentalType, int roomStandard, String amenitie, int numberOfFloors, AcompanyingService acompanyingService) throws IdExistException {
        super(id, serviceName, usableArea, rentalCost, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.amenitie = amenitie;
        this.numberOfFloors = numberOfFloors;
        this.acompanyingService = acompanyingService;
    }

    public String getAmenitie() {
        return amenitie;
    }
    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    @Override
    public String toString() {
        return "House{" +
                " id=" + id +
                ", roomStandard=" + roomStandard + "*"+
                ", amenitie='" + amenitie + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                ", acompanyingService=" + acompanyingService +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxNumberOfPeople=" + maxNumberOfPeople +
                ", rentalType='" + rentalType + '\'' +
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
