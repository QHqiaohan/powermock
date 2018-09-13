package com.chinasoft.asp.util;

import com.chinasoft.asp.pojo.NeproviderFactory;

public class CarriesExpansionStep
{

    public void intervo()
    {
        NeproviderFactory neproviderFactory=new NeproviderFactory("gaotong",6);
        System.out.println("new neproviderFactory:"+neproviderFactory);
        System.out.println(""+neproviderFactory.getTianxian());
    }

}

