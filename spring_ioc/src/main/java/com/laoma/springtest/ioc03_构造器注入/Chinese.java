package com.laoma.springtest.ioc03_构造器注入;

/**
 * @Auther: laoma
 * @create: 2017-06-27 下午1:47
 */
public class Chinese implements People {


    private Food food;

    private Sport sport;

    public Chinese(Food food, Sport sport) {
        this.food = food;
        this.sport = sport;
    }

    public String say() {
        return "我是中国人，我吃" + food.sayName() + "," + sport.doSomething();
    }
}
