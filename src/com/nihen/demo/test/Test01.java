package com.nihen.demo.test;

/**
 * @Description
 * @Author zhuguanglong
 * @Company
 * @Date 2021/08/15 19:22
 */

public class Test01 {

    /*
     * 1.单独使用：无论++还是--，结果都是+1过着-1的操作，也就是结果等于加一减一后的结果；
     * 2.和表达式使用：符号前置等于表达式先加减后赋值，也就是结果等于执行加减运算后的表达式结果；符号后置，结果相反。
     * @author zhuguanglong
     * @date 2021/8/15 19:36
     * @param args
     */
    public static void main(String[] args) {
        int a = 1;
//        int b = a++;
//        System.out.println(b);
//        int c =--a;
//        System.out.println(c);
          a--;
        System.out.println(a);

    }
}
