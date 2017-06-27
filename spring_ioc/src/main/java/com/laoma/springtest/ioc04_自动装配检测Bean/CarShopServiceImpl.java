package com.laoma.springtest.ioc04_自动装配检测Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: laoma
 * @create: 2017-06-27 下午2:13
 */
@Service
public class CarShopServiceImpl implements CarShopService {


    @Autowired
    private OrderDao orderDao;

    public String sellCar() {
        return orderDao.statisticsMoney("卡宴");
    }
}
