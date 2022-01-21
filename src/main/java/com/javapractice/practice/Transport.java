package com.javapractice.practice;

//An enum is a data type. IT encapsulates a list of ...
public enum Transport {
    CAR(100), //Km/hr
    MOTORBUS(50),
    TRAIN(20),
    AIRPLANE(1000),
    SHIP(70);

    int speed;

    Transport() {
        System.out.println("won't be printed.");
    }

    Transport(int speedHolder) {
        speed = speedHolder;
    }

    int getSpeed() {
        return speed;
    }

}

class TestEnum {
    public static void main(String[] args) {
        //using its static methods
        Transport allTransports[] = Transport.values();
        //print all
        for(Transport transport : allTransports) {
            System.out.println(transport.ordinal());
        }

        // case-sensitive
//        Transport tp = Transport.valueOf("CAR");
//        System.out.println(tp);

//        int carSpeed = Transport.CAR.getSpeed();
//        System.out.println(carSpeed);

    }
}
