package edu.tms;

public class AutoTruck extends GroundTransport{
    double liftingCapacity;

    public AutoTruck(double horsepower, double maxSpeed, double weight, String brand, int numberOfWheels, double fuelConsumption, double liftingCapacity){
        super(horsepower, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    public double getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(double liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }
    public String toString(){
        return super.toString() + "; Грузоподъемность (т): " + this.liftingCapacity;
    }
    public void loadAutotruck (int loadWeight){
        if (loadWeight> this.liftingCapacity*1000) {
            System.out.println("Грузовик " + this.getBrand() + " не подходит. Вам нужен грузовик побольше");
        }
        else {
            System.out.println("Грузовик " + this.getBrand() + " загружен");
        }
    }

}
