package com.springioc.humen;

import com.springioc.car.Car;

/**
 * @Author: zty
 * @Date: 2020/3/17 13:24
 */
public abstract class HumenWithCar implements Humen{
    protected Car car;

    public HumenWithCar(Car car) {
        this.car = car;
    }

    @Override
    public abstract void goHome();
}
