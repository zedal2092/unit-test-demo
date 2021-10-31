package com.example.demo;

import com.example.demo.easyDao.EasyDao;
import com.example.demo.easyFun.EasyMethod;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EasyMethodTestMock {

    @InjectMocks
    private EasyMethod easyMethod;

    @Mock
    private EasyDao easyDao;

    @Test
    public void testRainingRateMock() {

        Mockito.when(easyDao.getLocalPlace()).thenReturn("Kaohsiung");
        Mockito.when(easyDao.getRainingRate(Mockito.anyString())).thenReturn(30);

        Assert.assertEquals(true, easyMethod.isGoodWeather());
    }

}
