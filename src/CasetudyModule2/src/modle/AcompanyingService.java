package modle;

import java.io.Serializable;

public class AcompanyingService implements Serializable {
    private int unitMassage =0;
    private final double priceMassage = 200000;
    private int unitDrinking = 0;
    private final double priceDrinking = 100000;
    private int unitFood = 0;
    private final double priceFood = 300000;
    private int unitKaraoke = 0;
    private final double priceKaraoke = 400000;
    private int unitRentalCar = 0;
    private final double priceRentalCar = 600000;

    public AcompanyingService() {
    }
    public AcompanyingService(int unitMassage, int unitDrinking, int unitFood, int unitKaraoke, int unitRentalCar) {
        this.unitMassage = unitMassage;
        this.unitDrinking = unitDrinking;
        this.unitFood = unitFood;
        this.unitKaraoke = unitKaraoke;
        this.unitRentalCar = unitRentalCar;
    }

    public int getUnitMassage() {
        return unitMassage;
    }

    public void setUnitMassage(int unitMassage) {
        this.unitMassage = unitMassage;
    }

    public int getUnitDrinking() {
        return unitDrinking;
    }

    public void setUnitDrinking(int unitDrinking) {
        this.unitDrinking = unitDrinking;
    }

    public int getUnitFood() {
        return unitFood;
    }

    public void setUnitFood(int unitFood) {
        this.unitFood = unitFood;
    }

    public int getUnitKaraoke() {
        return unitKaraoke;
    }

    public void setUnitKaraoke(int unitKaraoke) {
        this.unitKaraoke = unitKaraoke;
    }

    public int getUnitRentalCar() {
        return unitRentalCar;
    }

    public void setUnitRentalCar(int unitRentalCar) {
        this.unitRentalCar = unitRentalCar;
    }

    public double getMassageCost(int unit){
        return unit*priceMassage;
    }
    public double getDrinkingCost(int unit){

        return unit*priceDrinking;
    }
    public double getFoodCost(int unit){
        return unit*priceFood;
    }
    public double getKaraokeCost(int unit){
        return unit*priceKaraoke;
    }
    public double getRentalCarCost(int unit) {
        return unit*priceRentalCar;
    }
    public double getTotalAcompanyingServiceCost(){
        return getMassageCost(getUnitMassage())+ getDrinkingCost(getUnitDrinking())
                +getFoodCost(getUnitFood())+getKaraokeCost(getUnitKaraoke())+getRentalCarCost(getUnitRentalCar());
    }

    @Override
    public String toString() {
        return "AcompanyingService{" +
                "unitMassage=" + unitMassage +
                ", priceMassage=" + priceMassage +
                ", unitDrinking=" + unitDrinking +
                ", priceDrinking=" + priceDrinking +
                ", unitFood=" + unitFood +
                ", priceFood=" + priceFood +
                ", unitKaraoke=" + unitKaraoke +
                ", priceKaraoke=" + priceKaraoke +
                ", unitRentalCar=" + unitRentalCar +
                ", priceRentalCar=" + priceRentalCar +
                '}';
    }
}
