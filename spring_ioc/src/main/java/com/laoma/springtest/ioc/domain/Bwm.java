package com.laoma.springtest.ioc.domain;

/**
 * @Auther: laoma
 * @create: 2017-06-26 下午5:47
 */
public class Bwm implements Car {

    private String carName;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void sayName() {

        System.out.println("I`m " + carName + ",i can run 300km/h");

    }
}
