package com.springioc.car;

public class Buick implements Car{
    @Override
    public void start(){
        System.out.println("Buick.start");
    }
    @Override
    public void turnLeft(){
        System.out.println("Buick.turnLeft");
    }
    @Override
    public void turnRight(){
        System.out.println("Buick.turnRight");
    }
    @Override
    public void stop(){
        System.out.println("Buick.stop");
    }
}
