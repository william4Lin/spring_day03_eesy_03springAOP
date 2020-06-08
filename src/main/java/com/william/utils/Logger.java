package com.william.utils;

/**
 * 用于记录了日志的工具类，提供了记录日志的公共方法
 */
public class Logger {

    /**
     * 用于打印日志，计划让其在切入点方法执行之前执行（切入点方法就是业务层方法）
     */
    public void printLog(){
        System.out.println("Logger类中的printLog方法执行了。。。");

    }
}
