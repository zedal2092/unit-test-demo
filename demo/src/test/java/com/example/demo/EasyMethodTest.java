package com.example.demo;


import com.example.demo.easyfun.EasyMethod;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EasyMethodTest {
    @InjectMocks
    private EasyMethod easyMethod;

    @Test
    public void testEasyMethod() {
        int result = easyMethod.method1();
        Assert.assertEquals(7, result);
    }
}