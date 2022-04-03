package modle;

import common.FuncWriteRead;
import manager.IdExistException;

import java.io.Serializable;

public abstract class Service implements Serializable,Comparable<Service> {
    public int id;
    public String serviceName;
    public double usableArea;
    public double rentalCost;
    public int maxNumberOfPeople;
    public String rentalType;

    public Service() {
    }

    public Service(int id, String serviceName, double usableArea, double rentalCost, int maxNumberOfPeople, String rentalType) throws IdExistException {
        if(FuncWriteRead.searchIdService(id)){
            throw new IdExistException("id đã tồn tại, vui lòng nhập lại");
        }else {
            this.id = id;
            this.serviceName = serviceName;
            this.usableArea = usableArea;
            this.rentalCost = rentalCost;
            this.maxNumberOfPeople = maxNumberOfPeople;
            this.rentalType = rentalType;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxNumberOfPeople=" + maxNumberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
