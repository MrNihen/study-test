package com.nihen.demo.test;

/**
 * @Description 测试死锁
 * @Author zhuguanglong
 * @Company
 * @Date 2021/09/16 15:35
 */
public class TestThread03 {
    /*
     * 造成死锁的四个必要条件：1.互斥条件 2.循环等待条件 3.不可剥夺条件
     * @author zhuguanglong
     * @date 2021/9/16 15:58
     * @param args
     */
    public static void main(String[] args) {
        //1.获取锁的可以是任意对象
        Object lockA = new Object();
        Object lockB = new Object();

        //2.创建线程1：创建一个类并实现Runnable接口
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //对象a获取锁
                synchronized (lockA){
                    System.out.println("获取锁A");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //获取锁b
                    synchronized (lockB){
                        System.out.println("等待获取锁B");
                    }

                }
            }
        });
        //3.启动线程1
        thread1.start();

        //4.创建线程2
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //对象a获取锁
                synchronized (lockB){
                    System.out.println("获取锁B");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //获取锁b
                    synchronized (lockA){
                        System.out.println("等待获取锁A");
                    }

                }
            }
        });
        //3.启动线程1
        thread2.start();
    }
}
