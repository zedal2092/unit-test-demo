package com.example.demo.easyController;

import com.example.demo.easyFun.EasyMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/EasyMethod")
public class EasyController {

    @Autowired
    private EasyMethod easyMethod;

    @PostMapping(path = "/isGoodWeather")
    public Object testIsGoodWeather(@RequestBody List<Object> param) {
        boolean isGoodWeather = easyMethod.isGoodWeather();

        if (isGoodWeather) {
            return "Is Good Weather";
        } else {
            return "Is Bad Weather";
        }
    }
}
