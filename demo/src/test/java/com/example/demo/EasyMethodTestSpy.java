package com.example.demo;

import com.example.demo.easyDao.EasyDao;
import com.example.demo.easyFun.EasyMethod;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class EasyMethodTestSpy {

    @InjectMocks
    private EasyMethod easyMethod;

    @Spy
    private EasyDao easyDao;

    @Test
    public void testRainingRateSpy() {
        Assert.assertEquals(false, easyMethod.isGoodWeather());
        verify(easyDao,times(1)).getLocalPlace();
        verify(easyDao,times(1)).getRainingRate("Keelung");
        verify(easyDao,times(0)).getRainingRate("Kaohsiung");
    }
}
