package modle;

import manager.IdExistException;

import java.io.Serializable;

public class Room extends Service implements Serializable {
    private String freeService;
    private AcompanyingService acompanyingService;

    public Room() {
    }

    public Room(String freeService, AcompanyingService acompanyingService) {
        this.freeService = freeService;
        this.acompanyingService = acompanyingService;
    }

    public Room(int id, String serviceName, double usableArea, double rentalCost, int maxNumberOfPeople, String rentalType, String freeService, AcompanyingService acompanyingService) throws IdExistException {
        super(id, serviceName, usableArea, rentalCost, maxNumberOfPeople, rentalType);
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
                " id=" + id +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", freeService='" + freeService + '\'' +
                ", rentalCost=" + rentalCost +
                ", maxNumberOfPeople=" + maxNumberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                ", acompanyingService=" + acompanyingService +
                '}';
    }


    @Override
    public int compareTo(Service o) {
        return this.getId() - o.getId();
    }
}
