package com.mycompany.playground;

public class Playground {
    public static void excute(sayGood sayhello){
        sayhello.sayGood();
    }
    public static void main(String[] args) {
        excute(() -> {
               System.out.println("Hello World!");
        });
        Car car = new Car(){
            @Override
            public void turn(){
                 System.out.println("Turn");
            }
        };
        car.turn();
    }
}

interface sayGood {
    public void sayGood();
}

abstract class Car{
    public void move(){
        System.out.println("Move");
    }
    public void stop(){
        System.out.println("Stop");
    }
    abstract public void turn();
}