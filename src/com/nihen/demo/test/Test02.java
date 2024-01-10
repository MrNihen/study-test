package com.nihen.demo.test;

import org.junit.Test;

import java.util.*;

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


    /**
     * 输入十个数，比较最大值并且打印。
     */
    @Test
    public void testShu(){

//        ArrayList<Integer> arrayList = new ArrayList();
//
//
//        int[] c = new int[30];
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("请输入十个数：");
//
//
//
//        for (int i=1;i<=10 ; i++){
//
//
//            int a = scanner.nextInt();
//
//
//
//
//        }
//        for (int b : arrayList){
//
//        }



        //1.定义循环变量
        int i = 1;
        //2.定义扫描器对象
        Scanner scanner = new Scanner(System.in);
        //3.提示用户输入第一个数字,并且同时将此数字赋值给最大值变量
        System.out.println("请输入一个整数：");
        int max = scanner.nextInt();

        //4.再输入另外9个数字
        System.out.println("请输入9个整数：");
        do{
            //4.1)得到输入的数字
            int num = scanner.nextInt();
            //4.2)比较输入的数字与上一次的最大值，如果当前输入的数字比最大
            //值大，就最大值就是当前的数字
            if(num > max){
                max = num;
            }
            i++;
        }while (i <= 9);
        //5.打印最大值
        System.out.println("max = " + max);



    }

    @Test
    public void testRandom(){
        //定义一个随机数
        Random random = new Random();
        //循环打印十次随机数
        for (int s=0;s<=10;s++){
            //定义一个1到1000的随机数(random生成的随机数是左开右闭区间）
            int a = random.nextInt(1000) + 1;
            //打印随机数
            System.out.print(a + " ");
        }
    }


    

}
