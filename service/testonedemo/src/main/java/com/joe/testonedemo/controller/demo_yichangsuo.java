package com.joe.testonedemo.controller;

import java.util.concurrent.TimeUnit;

public class demo_yichangsuo {

    int count =0;
    synchronized void  m(){
        System.out.println(Thread.currentThread().getName()+"start=");
        while (true){
            count++;
            //获取当线程下name
            System.out.println(Thread.currentThread().getName()+"end=");
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(count+"未进异常");
            if (count==7){


                System.out.println(count);
                int i=1/0;
                System.out.println(i);

            }

        }
    }

    public static void main(String[] args) {
        demo_yichangsuo demo_yichangsuo = new demo_yichangsuo();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                demo_yichangsuo.m();
            }
        };
        new Thread(runnable,"t1").start();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(runnable,"t2").start();


    }



}
