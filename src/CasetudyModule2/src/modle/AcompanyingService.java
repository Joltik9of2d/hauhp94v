package modle;

public class AcompanyingService {
    private int unitMassage =0;
    private int unitDrinking = 0;
    private int unitFood = 0;
    private int unitKaraoke = 0;
    private int unitRentalCar = 0;
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
        double priceMassage = 200000;
        return unit*priceMassage;
    }
    public double getDrinkingCost(int unit){
        double priceDrinking = 100000;
        return unit*priceDrinking;
    }
    public double getFoodCost(int unit){
        double priceFood = 300000;
        return unit*priceFood;
    }
    public double getKaraokeCost(int unit){
        double priceKaraoke = 400000;
        return unit*priceKaraoke;
    }
    public double getRentalCarCost(int unit) {
        double priceRentalCar = 600000;
        return unit*priceRentalCar;
    }
    public double getTotalAcompanyingServiceCost(){
        return getMassageCost(getUnitMassage())+ getDrinkingCost(getUnitDrinking())
                +getFoodCost(getUnitFood())+getKaraokeCost(getUnitKaraoke())+getRentalCarCost(getUnitRentalCar());
    }

}
