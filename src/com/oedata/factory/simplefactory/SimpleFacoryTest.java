package com.oedata.factory.simplefactory;

public class SimpleFacoryTest {
    public static void main(String[] args) {

        Car car = SimpleFactory.createCar("BMW");
        car.start();
    }
}
