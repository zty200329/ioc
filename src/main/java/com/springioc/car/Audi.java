package com.springioc.car;

public class Audi implements Car{
    @Override
    public void start(){
        System.out.println("Audi.start");
    }
    @Override
    public void turnLeft(){
        System.out.println("Audi.turnLeft");
    }
    @Override
    public void turnRight(){
        System.out.println("Audi.turnRight");
    }
    @Override
    public void stop(){
        System.out.println("Audi.stop");
    }
}
