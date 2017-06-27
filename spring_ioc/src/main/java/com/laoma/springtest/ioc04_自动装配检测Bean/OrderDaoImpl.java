package com.laoma.springtest.ioc04_自动装配检测Bean;

import org.springframework.stereotype.Repository;

/**
 * @Auther: laoma
 * @create: 2017-06-27 下午2:17
 */
@Repository
public class OrderDaoImpl implements OrderDao {

    public String statisticsMoney(String catName) {
        return "统计订单：xxx在MX 4s店 购买一辆" + catName;
    }
}
