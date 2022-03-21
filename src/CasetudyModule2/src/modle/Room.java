package modle;

public class Room extends Service{
    private String freeService;
    private AcompanyingService acompanyingService;

    public Room(String serviceName, double usableArea, double rentalCost, int maxNumberOfPeople, String rentalType, String freeService, AcompanyingService acompanyingService) {
        super(serviceName, usableArea, rentalCost, maxNumberOfPeople, rentalType);
        this.freeService = freeService;
        this.acompanyingService = acompanyingService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxNumberOfPeople=" + maxNumberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
