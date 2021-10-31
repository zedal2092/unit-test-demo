package com.example.demo.easyFun;

import com.example.demo.easyDao.EasyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EasyMethod {

    @Autowired
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
