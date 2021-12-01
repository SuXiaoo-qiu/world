package com.joe.testonedemo.controller;

import org.apache.tomcat.util.net.openssl.OpenSSLUtil;

import java.sql.SQLOutput;
import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class c_001 {
    public synchronized void m1(){
        System.out.println(Thread.currentThread().getName()+"mi_start=");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "m1_end");

    }
    public void m2() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "m2");
    }

    public static void main(String[] args) {
        c_001 c_001 = new c_001();
//        new Thread(()->c_001.m1(),"t1").start();
//        new Thread(()->c_001.m2(),"t2").start();

        new Thread(c_001::m1,"t1").start();
        new Thread(c_001::m2,"t2").start();
    }
}




class c_002 {
    String name;
    double balance;

    public synchronized void set(String name,double balance) {
        this.name=name;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.balance = balance;
    }
    //这里不加synchronized 就会出现脏读
    public  /*synchronized*/ double getBalance(String name){
        return this.balance;
    }

    public static void main(String[] args) {
        c_002 c_002 = new c_002();
        //出现脏读
        new Thread(()->c_002.set("zhangsan", 123)).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(c_002.getBalance("zhangsan"));
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(c_002.getBalance("zhangsna"));
    }

}

class t2{
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
    //在m1中调用m2 等m2执行完才执行m1
    synchronized void m2() {
        try {

            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("mm2");
    }

    public static void main(String[] args) {
        new t2().m1();
    }
}
