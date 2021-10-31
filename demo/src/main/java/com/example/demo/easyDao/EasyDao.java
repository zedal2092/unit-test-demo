package com.example.demo.easyDao;

import org.springframework.stereotype.Service;

@Service
public class EasyDao {

    public String getLocalPlace() {
        //抓取當地位址
        return "Keelung";
    }

    public int getRainingRate(String place) {
        int rainingRate = 0;
        //抓取天氣資料庫邏輯
        if ("Kaohsiung".equals(place)){
            rainingRate = 30;
        } else if ("Keelung".equals(place)){
            rainingRate = 70;
        }
        return rainingRate;
    }
}
