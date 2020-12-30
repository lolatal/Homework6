package edu.tms;

public class PassengerCar extends GroundTransport {
    String bodyworkType;
    int numberOfPassengerSeats;

    public PassengerCar(double horsepower,  double maxSpeed, double weight, String brand, int numberOfWheels, double fuelConsumption, String bodyworkType, int numberOfPassengerSeats){
        super (horsepower, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.bodyworkType = bodyworkType;
        this.numberOfPassengerSeats = numberOfPassengerSeats;
    }

    public String getBodyworkType() {
        return bodyworkType;
    }

    public void setBodyworkType(String bodyworkType) {
        this.bodyworkType = bodyworkType;
    }

    public int getNumberOfPassengerSeats() {
        return numberOfPassengerSeats;
    }

    public void setNumberOfPassengerSeats(int numberOfPassengerSeats) {
        this.numberOfPassengerSeats = numberOfPassengerSeats;
    }
    public String toString() {
        return super.toString() + "; Тип кузова: " + this.bodyworkType + "; Кол-во пассажирских сидений: " + this.numberOfPassengerSeats;
    }
    public double [] calculateDistanceAndFuel (double time){
        double [] numbers = new double[2];
        double distance = time * this.getMaxSpeed();
        double consumedFuel = this.getConsumedFuel(distance);
        numbers [0] = distance;
        numbers [1] = consumedFuel;
        return numbers;
    }
    private double getConsumedFuel (double distance){
        return (distance) * this.fuelConsumption / 100;
    }

}
