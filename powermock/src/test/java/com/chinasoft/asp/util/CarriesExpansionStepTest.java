package com.chinasoft.asp.util;

import com.chinasoft.asp.pojo.NeproviderFactory;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;

public class CarriesExpansionStepTest
{
    private CarriesExpansionStep carriesExpansionStep;

    private NeproviderFactory neproviderFactory;

    @Before
    public void init() throws Exception {
        carriesExpansionStep= new CarriesExpansionStep();

        neproviderFactory=PowerMockito.mock(NeproviderFactory.class);
        PowerMockito.whenNew(NeproviderFactory.class).withArguments(
                Mockito.anyString(),
                Mockito.anyDouble()
        ).thenReturn(neproviderFactory);
        System.out.println("mock neproviderFactory:"+neproviderFactory);
    }

    @Test
    public void intervoTest()
    {
        carriesExpansionStep.intervo();
    }
}