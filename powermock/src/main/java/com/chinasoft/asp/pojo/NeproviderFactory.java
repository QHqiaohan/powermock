package com.chinasoft.asp.pojo;

public class NeproviderFactory
{
    private String tianxian;

    private double height;

    public NeproviderFactory(String tianxian, double height)
    {
        this.tianxian = tianxian;
        this.height = height;
    }

    public String getTianxian() {
        return tianxian;
    }

    public void setTianxian(String tianxian) {
        this.tianxian = tianxian;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void buildNeprovider()
    {
        System.out.println("建天线");
    }
}
