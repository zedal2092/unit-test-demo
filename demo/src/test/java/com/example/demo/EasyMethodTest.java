package com.example.demo;


import com.example.demo.easyFun.EasyMethod;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EasyMethodTest {

    //arrange
    @InjectMocks
    private EasyMethod easyMethod;
    int expected = 7;

    @Test
    public void testEasyMethod() {

        //act
        int result = easyMethod.method1();

        //assert
        Assert.assertEquals(expected, result);
    }

}