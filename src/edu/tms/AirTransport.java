package edu.tms;

public class AirTransport extends Transportation {
    double wingspan;
    int minAirstripLength;

    public AirTransport(double horsepower, double maxSpeed, double weight, String brand, double wingspan, int minAirstripLength){
        super(horsepower, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minAirstripLength =minAirstripLength;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinAirstripLength() {
        return minAirstripLength;
    }

    public void setMinAirstripLength(int minAirstripLength) {
        this.minAirstripLength = minAirstripLength;
    }
    public String toString () {
       return super.toString() + "; Размах крыльев (м): " + this.wingspan + "; Минимальная длина взлетно-посадочной полосы: " + this.minAirstripLength;
    }
}
