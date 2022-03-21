package modle;

import java.time.LocalDate;

public class House extends Service implements RentalContract{
    private String roomStandard;
    private String amenitie;
    private byte numberOfFloors;
    private AcompanyingService acompanyingService;
    public House(String serviceName, double usableArea, double rentalCost, int maxNumberOfPeople, String rentalType, String roomStandard, String amenitie, byte numberOfFloors, AcompanyingService acompanyingService) {
        super(serviceName, usableArea, rentalCost, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.amenitie = amenitie;
        this.numberOfFloors = numberOfFloors;
        this.acompanyingService = acompanyingService;
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

    public byte getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(byte numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", amenitie='" + amenitie + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxNumberOfPeople=" + maxNumberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    @Override
    public void rentalContract(int numberContract, LocalDate startDay, LocalDate endDay, double deposit, double totalPay) {

    }
}
