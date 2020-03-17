package com.springioc.humen;

import com.springioc.car.Car;

/**
 * @Author: zty
 * @Date: 2020/3/17 13:27
 */
public class LiSi extends HumenWithCar {
    public LiSi(Car car) {
        super(car);
    }

    @Override
    public void goHome() {
        car.start();
        car.stop();
    }
}
