package com.company;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setName("Toyota");
        car.setSpeed(200);

        Car car1 = new Car();
        car1.setName("Nissan");
        car1.setSpeed(260);

        Car car2 = new Car();
        car2.setName("Mercedes");
        car2.setSpeed(100);

        System.out.println("===================================");
        System.out.println(" The car names is : " + car.getName());
        System.out.println(" The car runs at a speed of : " + car.getSpeed() + " per hour");
        System.out.println("===================================");


        System.out.println(" The car names is : " + car1.getName());
        System.out.println(" The car runs at a speed of : " + car1.getSpeed() + " per hour");
        System.out.println("===================================");

        System.out.println(" The car names is : " + car2.getName());
        System.out.println(" The car runs at a speed of : " + car2.getSpeed() + " per hour");
        System.out.println("===================================");


    }
}

class Car{

    private String name;
    private double speed;

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed *10.5;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}