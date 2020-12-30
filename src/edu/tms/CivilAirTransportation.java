package edu.tms;

public class CivilAirTransportation extends AirTransport {
    int numberOfPassengers;
    boolean isPremium;

    public CivilAirTransportation(double horsepower, double maxSpeed, double weight, String brand, double wingspan, int minAirstripLength, int numberOfPassengers, boolean isPremium) {
        super(horsepower, maxSpeed, weight, brand, wingspan, minAirstripLength);
        this.numberOfPassengers = numberOfPassengers;
        this.isPremium = isPremium;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public String toString() {
        return super.toString() + "; Количество пассажиров: " + this.numberOfPassengers + "; Наличие бизнесс-класса: " + this.isPremium;
    }

    public void passengerCapacity(int passengers) {
        if (passengers > this.numberOfPassengers) {
            System.out.println("Самолет " + this.getBrand() + " не подходит. Мест для пассажиров недостаточно");
        } else {
            System.out.println("Самолет " + this.getBrand() + " загружен. Мест для пассажиров достаточно");
        }
    }
}
