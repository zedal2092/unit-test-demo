package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EasyMethodTestCaptor {

    @Captor
    private ArgumentCaptor argument;

    @Test
    public void argumentCaptorTest() {

        List mock = mock(List.class);
        List mock2 = mock(List.class);

        mock.add("John");
        mock2.add("Brian");
        mock2.add("Jim");

        verify(mock).add(argument.capture());
        Assert.assertEquals("John", argument.getValue());

        verify(mock2, times(2)).add(argument.capture());

        Assert.assertEquals("Jim", argument.getValue());
        Assert.assertArrayEquals(new Object[]{"John", "Brian","Jim"},argument.getAllValues().toArray());
    }

}
