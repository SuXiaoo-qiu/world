package com.joe.testonedemo.controller;

import java.util.concurrent.TimeUnit;

public class T3 {
    synchronized void m(){
        System.out.println("m_start");

        try {
            TimeUnit.MILLISECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m_end");
    }

    public static void main(String[] args) {
        new TT().m();
    }



}
//  可重入
class TT extends T3{

    @Override
    synchronized void m() {
        System.out.println("sta");

        super.m();
        System.out.println("cend");
    }
}
