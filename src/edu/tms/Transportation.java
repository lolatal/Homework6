package edu.tms;

public class Transportation {
    double horsepower;
    double maxSpeed;
    double weight;
    String brand;


    public Transportation(){

    }
    public Transportation (double horsepower, double maxSpeed, double weight, String brand) {
        this.horsepower = horsepower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public double getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(double horsepower) {
        this.horsepower = horsepower;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getPowerKwt() {
        return String.valueOf(horsepower*0.74);
    }

    public String toString(){
        return "Мощность (в лошадиных силах): "+ this.horsepower + "; Мощность (в киловаттах): " + this.getPowerKwt()+ "; Максимальная скорость: " + this.maxSpeed + "; Масса (кг): "+ this.weight + "; Марка: " + this.brand;
    }

}
