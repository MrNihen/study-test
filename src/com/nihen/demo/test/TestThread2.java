package com.nihen.demo.test;

/**
 * @Description 测试死锁
 * @Author zhuguanglong
 * @Company
 * @Date 2021/09/16 0:34
 */
public class TestThread2 {
    private static Object lockA = new Object();
    private static Object lockB = new Object();

    public static void main(String[] agrs){
        Thread t1 = new Thread(() -> {
            synchronized(lockA) { // 获得lockA的锁
                System.out.println("t1 getLockA");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(lockB) { // 获得lockB的锁
                    System.out.println(" t1 getLockB");
                } // 释放lockB的锁
            } // 释放lockA的锁

            System.out.println("t1 end");
        });

        Thread t2 = new Thread(() -> {
            synchronized(lockB) { // 获得lockB的锁
                System.out.println("t2 getLockB");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(lockA) { // 获得lockA的锁
                    System.out.println("t2 getLockA");
                } // 释放lockA的锁
            } // 释放lockB的锁
            System.out.println("t2 end");
        });

        t1.start();
        t2.start();
    }
}
