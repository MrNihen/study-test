package com.nihen.demo.test;

/**
 * Created by WF on 2020/7/14 10:35
 * 单例模式:
 */
public class User {
    //方法一：懒汉式
    //1.定义一个私有的静态的对象
    //private static User user = null;
    //2.定义一个私有的构造方法
    //private User(){}
    //3.定义一个用于外界得到对象的公有的静态方法
    // public static User getUser(){
    //     if(user == null){
    //         user = new User();
    //     }
    //     return user;
    // }

    //方法二：饿汉式
    //1.定义一个私有的静态对象
    private static User user = new User();
    //2.定义一个私有的构造方法
    private User(){}
    //3.定义一个公有的静态方法
    public static User getUser(){
        return user;
    }

}
