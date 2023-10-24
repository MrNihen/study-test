package com.nihen.demo.test;

/**
 * @Description 创建多线程的两种方式
 * @Author zhuguanglong
 * @Company
 * @Date 2021/08/27 2:00
 */
public class TestThread {

    //main()是开启线程的入口
    public static void main(String[] args) {

        //1.方法一：继承Thread类，资源不能共享；
        new Thread01().start();
        new Thread01().start();
        new Thread01().start();

        //2.方法二：实现Runable接口，资源能共享；
        Thread02 thread02 = new Thread02();
        new Thread(thread02).start();
        new Thread(thread02).start();
        new Thread(thread02).start();
    }

    //1.方法一：继承Thread类，资源不能共享；
    static class Thread01 extends Thread{

        private int a = 1;
        @Override
        public void run() {
            System.out.println("Thread01:" + Thread.currentThread().getName()+ a++);
        }
    }


    //2.方法二：实现Runable接口，资源能共享；
    static class Thread02 implements Runnable{

        private int b = 1;
        @Override
        public void run() {
            System.out.println("Thread02:"  + Thread.currentThread().getName()+ b++);
        }
    }



}
