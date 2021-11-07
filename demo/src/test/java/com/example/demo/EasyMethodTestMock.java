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

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

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

        verify(easyDao,times(1)).getLocalPlace();
        verify(easyDao,times(0)).getRainingRate("Keelung");
        verify(easyDao,times(1)).getRainingRate("Kaohsiung");

    }

}
