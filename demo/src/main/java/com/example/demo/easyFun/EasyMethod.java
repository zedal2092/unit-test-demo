package com.example.demo.easyFun;

import com.example.demo.easyDao.EasyDao;
import org.springframework.stereotype.Repository;

@Repository
public class EasyMethod {

    private EasyDao easyDao;

    private int baseNumber = 5;

    public int method1() {
        return baseNumber + 2;
    }

    public boolean isGoodWeather() {
        String place = easyDao.getLocalPlace();
        int rainingRate =  easyDao.getRainingRate(place);
        return rainingRate <= 30 && rainingRate != 0;
    }

}
