package edu.tms;
import java.util.Scanner;

public class DemoTransport {
    public static void main(String[] args) {
        PassengerCar car = new PassengerCar (523, 250, 3000, "BMW X6", 4, 6.9, "SUV", 4);
        GroundTransport groundTransport = car;
        System.out.println("Введите время в пути (в часах)");
        Scanner scanner = new Scanner(System.in);
        double time = scanner.nextDouble();
        double[] finalNumbers = car.calculateDistanceAndFuel(time);
        System.out.println("За время " + time + " ч, автомобиль " + car.getBrand() + " двигаясь с максимальной скоростью " + car.getMaxSpeed()
        + " км/ч проедет " + finalNumbers [0] + " км и израсходует " + finalNumbers[1] + " литров топлива.");
        System.out.println("---------------------------");

        AutoTruck truck = new AutoTruck(420,150, 14000, "Vvolvo FMX", 8, 35, 35);
        GroundTransport groundTransport1 = truck;
        System.out.println("Введите массу груза (в кг)");
        int loadWeight = scanner.nextInt();
        truck.loadAutotruck(loadWeight);
        System.out.println("---------------------------");

        CivilAirTransportation civilPlane = new CivilAirTransportation(90000, 905, 139000, "Boeing 777", 60.9, 1200, 550, true);
        AirTransport airTransport1 = civilPlane;
        System.out.println("Введите количество пассажиров");
        int passengers = scanner.nextInt();
        civilPlane.passengerCapacity(passengers);
        System.out.println("---------------------------");

        MilitaryAirTransportation militaryPlane = new MilitaryAirTransportation(17000, 1930,13000, "Lockheed Martin F-35", 10.6, 500, true, 2);
        AirTransport airTransport = militaryPlane;
        militaryPlane.shootRockets();
        militaryPlane.bailout();
        System.out.println("---------------------------");
        System.out.println("Легковой автомобиль: " + car);
        System.out.println("Грузовой автомобиль: " + truck);
        System.out.println("Гражданский самолет: " + civilPlane);
        System.out.println("Военный самолет: " + militaryPlane);


    }
}
