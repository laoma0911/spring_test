package com.laoma.springtest.ioc02_属性的依赖注入;

/**
 * @Auther: laoma
 * @create: 2017-06-27 下午1:47
 */
public class Chinese implements People {


    private Food food;

    public void setFood(Food food) {
        this.food = food;
    }

    public String say() {
        return "我是中国人，我吃" + food.sayName();
    }
}
