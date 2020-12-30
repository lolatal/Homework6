package edu.tms;

public class MilitaryAirTransportation extends AirTransport {
    boolean bailoutPossibility;
    int numberOfRockets;

    public MilitaryAirTransportation(double horsepower, double maxSpeed, double weight, String brand, double wingspan, int minAirstripLength, boolean bailoutPossibility, int numberOfRockets){
        super (horsepower, maxSpeed, weight, brand, wingspan, minAirstripLength);
        this.bailoutPossibility = bailoutPossibility;
        this.numberOfRockets = numberOfRockets;
    }

    public boolean isBailoutPossibility() {
        return bailoutPossibility;
    }

    public void setBailoutPossibility(boolean bailoutPossibility) {
        this.bailoutPossibility = bailoutPossibility;
    }

    public int getNumberOfRockets() {
        return numberOfRockets;
    }

    public void setNumberOfRockets(int numberOfRockets) {
        this.numberOfRockets = numberOfRockets;
    }
    public String toString(){
        return super.toString()+ "; Наличие системы катапультирования: " + this.bailoutPossibility + "; Количество ракет на борту: " + this.numberOfRockets;
    }
    public void shootRockets() {
        if (numberOfRockets > 0) {
            System.out.println("В военном самолете " + this.getBrand() + " ракета пошла");
        } else {
            System.out.println("В военном самолете " + this.getBrand() + "Боеприпасы отсутствуют");
        }
    }
    public void bailout(){
        if(true){
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("В военном самолете " + this.getBrand() + " нет такой системы");
        }
    }

}
