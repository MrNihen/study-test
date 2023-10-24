package com.nihen.demo.test;

import org.junit.Test;

/**
 * @Description 测试冒泡排序
 * @Author zhuguanglong
 * @Company
 * @Date 2021/08/18 12:33
 */
public class Test02 {

    /**
     * 九九乘法口诀表
     * @author zhuguanglong
     * @date 2021/8/21 0:29
     */
    @Test
    public void test01(){
        for (int i=1;i<=9;i++){
            for (int j=1;j <= i;j++){
                //打印表达式和值
                System.out.print(j + "x" + i + "=" + i*j + "  ");
                //换行逻辑，如果两个值相等，就换行
                if (i==j){
                    System.out.println();
                }
            }
        }
    }

    /**
     * 冒泡排序
     * @author zhuguanglong
     * @date 2021/8/21 0:30
     */
    @Test
    public void test02(){
        int[] a = {2,6,3,5,8,7,9};
        for (int b : a){
            System.out.println(b);
        }
        System.out.println("========================================");
        for (int i=0;i < a.length;i++){
            for (int j=0;j< a.length-i-1;j++){
                if (a[j] > a[j+1]){
                    int temp= a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            System.out.println(a[i]);
        }
    }

    /**
     * 打印1-1000的质数/素数
     */
    @Test
    public void testzhishu(){
        int a = 0;

        for (int i = 1;i <= 1000; i++){

            if ( i % 2 !=0 && i%3 !=0 && i%5 !=0 && i%7 !=0 && i%9!=0){
                System.out.print(i + "  ");
            }
            a++;
        }
    }






    

}
