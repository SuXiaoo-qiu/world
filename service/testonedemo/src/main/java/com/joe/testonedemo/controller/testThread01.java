package com.joe.testonedemo.controller;

import org.springframework.web.context.request.NativeWebRequest;

public class testThread01 {

        static class myThread extends Thread {
            @Override
            public void run() {
                System.out.println(this.getState()+"可运行状态(运行状态和就绪状态");
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(i);
                }
            }
        }
        public static void main(String[] args) {
            myThread myThread = new myThread();
            //获取这个线程的状态
            System.out.println(myThread.getState()+"新建状态");
            myThread.start();

            try {
                myThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(myThread.getState()+"结束状态");
        }



}


class T2{

    /* public static void main(String[] args) {
              int count =10;
             Object o  = new Object();
             m(o,count);
        }*/
    public static void m(Object o, int count) {
        synchronized(o) {  //想要执行当前代码必须要拿到 o 这个对象的锁才能才能执行
            count--;
            /*d当前线程名字*/
            System.out.println(Thread.currentThread().getName()+"coutn="+count);

        }
    }


    //比较简单的方式sync(this)
    public  void m01() {
        int count =10;
        synchronized(this) {  //想要执行当前代码必须要拿到 o 这个对象的锁才能才能执行
            count--;
            /*d当前线程名字*/
            System.out.println(Thread.currentThread().getName()+"coutn="+count);

        }

    }

    //也可以写城这样
    public synchronized void  m02() {
        int count =10;

        count--;
        System.out.println(Thread.currentThread().getName()+"coutn="+count);



    }



}

class T{
    private static int count =10;

    public synchronized static  void m03() {
        int count =10;
        count--;
        System.out.println(Thread.currentThread().getName()+"coutn="+count);

    }
    public static  void mm(){
        synchronized (T.class) {  //锁T类的对象

            count--;
        }
    }

}


class cc_05 implements Runnable{
    /**
     * 使用这个volatile 可以得到修改的内容
     * synchronized 加锁循序输出(自己理解 感觉有点问题)
     */
        private /*volatile*/ int count = 100;
    @Override
    public  void run() {
        count--;
        System.out.println(Thread.currentThread().getName()+"coutn="+count);
    }

    public static void main(String[] args) {
        cc_05 t = new cc_05();
        for (int i = 0; i < 100; i++) {
            new Thread(t, "THREAD"+i).start();
        }
    }


}
