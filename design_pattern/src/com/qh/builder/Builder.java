package com.qh.builder;

/**
 * 抽象构建
 */
public interface Builder {

    /**
     * 打基础
     */
     void  buildBasic();

    /**
     * 砌墙
     */
     void  buildWalls();

    /**
     * 封顶
     */
     void  roofed();

    /**
     * 建房子
     * @return
     */
     Product buildProduct();

}
