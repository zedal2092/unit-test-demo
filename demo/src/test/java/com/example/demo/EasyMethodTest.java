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

    @Test
    public void test() {
        System.out.println(0.06 + 0.01);
        System.out.println(1.0 - 0.42);
        System.out.println(4.015 * 100);
        System.out.println(123.3 / 100);
    }

}