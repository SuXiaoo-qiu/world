package com.joe.testonedemo.controller;

import com.joe.testonedemo.utils.R;

import java.sql.Timestamp;
import java.util.concurrent.*;

/**
 * 模拟线程执行
 */
public class test01Thread {
    private static class   a extends Thread{
        @Override
        public void run() {
            for (int i = 0; i <100; i++ ) {
                try {
                    TimeUnit.MILLISECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("aaaaaaaaaa");
            }
        }
    }

   /* public static void main(String[] args) {
        new a().start();
        for (int i = 0; i < 100; i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("aaaaseeeeeeeeeeeeee");
        }
    }*/


    /**
     * 创建线程的几种方式 创建线程有三种方式
     * 启动线程有五种方式
     *
     */

    //1 继承thread 类
    static class myThread extends Thread {
        @Override
        public void run() {
            System.out.println("hello joeworld");
        }
    }
    //实现runnable 接口
    static class myThread01 implements Runnable {
        @Override
        public void run() {
            System.out.println("runnable线程启动");
        }
    }
    //继承考了 包 Callable接口
    static class myThread02 implements Callable<String> {

        @Override
        public String call() throws Exception {
            System.out.println("实现考了包接口");
            return "success";
        }
    }


    //启动线程的五种方式

    /**
     * 1 直接new 方法名字 点start
     * 2 用过thread 类 来启动
     * 3 通过lambda表达式来启动
     * 4 通过创建thread对象来启动
     * 5 通过线程池的方式来创建
     *
     * @param args
     */
/*
    public static void main(String[] args) {
        new myThread().start();
        new Thread(new myThread01()).start();

        new Thread(()->{
            System.out.println("My lambda");
        }).start();
                                        //非哦特塔斯克
        Thread thread = new Thread(new FutureTask<String>(new myThread02()));
        thread.start();

                                    //一颗晒提的死   牛新购夫外的一刻晒地的
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.execute(()->{
            System.out.println("pool");
        });
        service.shutdown();
    }
*/
  /*  public static void main(String[] args) {
//        testSleep();
//        testYield();
        testJoin();
    }
*/

    /**
     * 线程睡眠5秒  睡醒自动执行
     */
    static void testSleep(){
        new Thread(()->{
            for (int i = 0; i < 50; i++) {
                System.out.println(i+"A");
                try {
                    Thread.sleep(500); //0.5秒  第一种睡眠方式
//                    TimeUnit.MILLISECONDS.sleep(500); //第二种启动睡眠方式
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }


//Yield V哦的   也就是当前线程拿到cpu执行权限后  让其他线程执行 完事后再执行
    // 此线程是抢占cup 也就是说 不一定哪个线程执行   让行也测试不出来
static void testYield() {
        new Thread(()->{
            for (int i = 0; i <50; i++) {
                if (i%10==0) Thread.yield();
                System.out.println("啊"+i);

            }
        }).start();

    new Thread(()->{
        for (int i = 0; i <50; i++) {
            if (i%10==0) Thread.yield();
            System.out.println("啊++++++++++++++++"+i);

        }
    }).start();

}






    static void testJoin() {
        Thread t1 =  new Thread(()->{
            for (int i = 0; i < 50; i++) {
                System.out.println(i+"SSS");
                try {
                    Thread.sleep(500);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        Thread t2 =  new Thread(()->{
            //先让t1 这个线程去跑 跑完后自己再跑
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("dcccccccc"+i);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
t1.start();
t2.start();

    }



}
