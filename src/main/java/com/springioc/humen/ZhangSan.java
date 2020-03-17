package com.springioc.humen;

import com.springioc.car.Car;

/**
 * @Author: zty
 * @Date: 2020/3/17 13:26
 */
public class ZhangSan extends HumenWithCar {
    public ZhangSan(Car car) {
        super(car);
    }

    @Override
    public void goHome() {
        car.start();
        car.turnLeft();
        car.turnRight();
        car.start();
    }
}
