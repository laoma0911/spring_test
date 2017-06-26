package com.laoma.springtest.ioc.domain;

/**
 * @Auther: laoma
 * @create: 2017-06-26 下午5:49
 */
public class Benz implements Car {

    private String carName;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void sayName() {

        System.out.println("I`m " + carName + ",i can run 290km/h");

    }
}
