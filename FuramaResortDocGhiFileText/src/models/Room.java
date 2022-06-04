package models;

public class Room extends Services{
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String serviceName, String usableArea, double rentalCost,
                String maxNumberOfPeople, String rentalType, String freeService) {
        super(id, serviceName, usableArea, rentalCost, maxNumberOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
    @Override
    public String showInfor() {
        return "Room{" +
                " id='" + id + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", freeService='" + freeService + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +" Triệu"+
                ", maxNumberOfPeople=" + maxNumberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return super.toString() + ","+ freeService ;
    }
}
