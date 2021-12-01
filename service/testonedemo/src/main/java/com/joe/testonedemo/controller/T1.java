package com.joe.testonedemo.controller;

import java.util.concurrent.TimeUnit;

public class T1 {
    synchronized void m1(){
        System.out.println("m1 start");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m2();
        System.out.println("m1 end");
    }
    synchronized void m2() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("mm2");
    }

    public static void main(String[] args) {
        new T1().m1();
    }
}
