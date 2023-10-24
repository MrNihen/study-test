package com.nihen.demo.test;

/**
 * @Description 单例设计模式：只有一个实例
 * @Author zhuguanglong
 * @Company
 * @Date 2021/09/16 16:04
 */
public class Simple{
    //1.饿汉式：一开始就穿件对象
    //1.1)创建一个私有的常量
    //方法一：懒汉式
    //1.定义一个私有的静态的对象
    //private static Simple simple = null;
    //2.定义一个私有的构造方法
    //private Simple(){}
    //3.定义一个用于外界得到对象的公有的静态方法
    // public static Simple getSimple(){
    //     if(simple == null){
    //         simple = new Simple();
    //     }
    //     return simple;
    // }

    //方法二：饿汉式
    //1.定义一个私有的静态对象
    private static Simple simple = new Simple();
    //2.定义一个私有的构造方法
    private Simple(){}
    //3.定义一个公有的静态方法
    public static Simple getSimple(){
        return simple;
    }
}
