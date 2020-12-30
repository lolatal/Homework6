package edu.tms;

public class GroundTransport extends Transportation {
    int numberOfWheels;
    double fuelConsumption;

    public GroundTransport (double horsepower, double maxSpeed, double weight, String brand, int numberOfWheels, double fuelConsumption){
        super(horsepower, maxSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    public String toString(){
        return super.toString() + "; Количество колес: " + this.numberOfWheels + "; Расход топлива(л/100 км): " + this.fuelConsumption;
    }
}
