package com.nihen.demo.test;

import com.nihen.demo.pojo.Student;
import org.junit.Test;

import java.util.*;

/**
 * @Description  测试集合
 * @Author zhuguanglong
 * @Company
 * @Date 2021/08/26 15:22
 */
public class Test03 {


    //1.arraylist集合（有序）
    @Test
    public void testArrayList(){
        List<Student> students = new ArrayList<>();

        Student student01 = new Student(1,"张三","男",12);
        Student student02 = new Student(2,"李四","女",13);

        //添加
        students.add(student01);
        students.add(student02);
        System.out.println(students);

        //修改（根据下标）
        Student student03 = new Student(3,"王五","男",14);
        students.set(1,student03);
        System.out.println(students);

        //删除(根据对象或下标)
        students.remove(student01);
        System.out.println(students);
        students.add(student01);
        System.out.println(students);
        students.remove(1);
        System.out.println(students);

        //遍历
        students.add(student01);
        students.add(student02);
        System.out.println(students);
        for (Student student : students){
            System.out.println(student);
        }
    }


    //2.linkedlist集合
    @Test
    public void testLinkedList(){

        List<Student> students = new LinkedList<>();

        Student student01 = new Student(1,"张三","男",12);
        Student student02 = new Student(2,"李四","女",13);

        //添加
        students.add(student01);
        students.add(student02);
        System.out.println(students);

        //修改（根据下标）
        Student student03 = new Student(3,"王五","男",14);
        students.set(1,student03);
        System.out.println(students);

        //删除(根据对象或下标)
        students.remove(student01);
        System.out.println(students);
        students.add(student01);
        System.out.println(students);
        students.remove(1);
        System.out.println(students);
        List<Student> students1 = new LinkedList<>();
        students1.add(student01);
        students1.add(student02);
        System.out.println(students);
        //添加小集合
        students.addAll(students1);
        System.out.println(students);
        //删除小集合
        students.removeAll(students1);
        System.out.println(students);

        //遍历
        students.addAll(students1);
        for (Student student: students){
            System.out.println(student);
        }
    }

    //3.hashset集合(无序）
    @Test
    public void testHashSet(){

        Set<Student> students = new HashSet<>();

        Student student01 = new Student(1,"张三","男",12);
        Student student02 = new Student(2,"李四","女",13);

        //添加
        students.add(student01);
        students.add(student02);
        System.out.println(students);

        //包含
        if (students.contains(student01)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        //是否空白
        if (students.isEmpty()){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        //遍历1
        students.forEach(student -> {
            System.out.println(student);
        });

        //遍历2
        for (Student student: students){
            System.out.println(student);
        }

        //删除
        students.remove(student01);
        System.out.println(students);
    }

    //4.TreeSet集合（有序：二叉树排好序）
    @Test
    public void testTreeSet(){

        Set<Object> students = new TreeSet<>();

        //添加
        students.add("周1");
        students.add("周4");
        students.add("周3");
        students.add("周6");
        students.add("周5");
        students.add("周2");
        System.out.println(students);

        //遍历
        students.forEach(o -> {
            System.out.println(o);
        });

        //包含
        if (students.contains("周7")){
            System.out.println(true);
        }else {
            System.out.println(false);
        };

        //删除
        students.remove("周6");
        System.out.println(students);
        //遍历
        students.forEach(o -> {
            System.out.println(o);
        });

    }

    //5.hashmap(无序：不安全)
    @Test
    public void testHashMap(){

        Map studentMap = new HashMap();

        Student student01 = new Student(1,"张三","男",12);
        Student student02 = new Student(2,"李四","女",13);

        //添加
        studentMap.put("student01",student01);
        studentMap.put("student02",student02);
        System.out.println(studentMap);

        //修改(按照key，直接添加，新值覆盖旧值)
        Student student03 = new Student(3,"王五","男",14);
        studentMap.put("student01",student03);
        System.out.println(studentMap);

        //删除(按照key删除)
        studentMap.remove("student01");
        System.out.println(studentMap);

        //遍历
        //遍历key
        studentMap.put("student01",student01);
        //拿到key
        System.out.println(studentMap.keySet());
        //遍历key，根据key拿到值
        for (Object key : studentMap.keySet()){
            studentMap.get(key);
            System.out.println(key);
            System.out.println(studentMap.get(key));
        }

        //直接遍历拿到值
        for (Object student : studentMap.values()){
            System.out.println(student);
        }
    }

    //6.hashTable(无序，线程安全)
    @Test
    public void testHashTable(){

        Map hashtable = new Hashtable();

        Student student01 = new Student(1,"张三","男",12);
        Student student02 = new Student(2,"李四","女",13);

        //添加
        hashtable.put("student01",student01);
        hashtable.put("student02",student02);
        System.out.println(hashtable);

        //修改
        Student student03 = new Student(3,"王五","男",14);
        hashtable.put("student02",student03);
        System.out.println(hashtable);

        //遍历key
        for (Object key : hashtable.keySet()){
            System.out.println(key);
        }

        //遍历值
        for (Object student: hashtable.values()){
            System.out.println(student);
        }

        //根据key,查找值
        for (Object key : hashtable.keySet()){
            hashtable.get(key);
            System.out.println(hashtable.get(key));
        }
    }


    /**
     * 冒泡排序
     */
    @Test
    public void maoPaoTest(){
        //定义一个要排序的数组
        int[] a={1,5,3,7,12,10,6};
        //第一层排序表示的是遍历整个数组的元素，每次取一个
        for (int i=0;i< a.length-1;i++){
            //第二层排序表示的是除了第一层拿出来的元素，剩下的一一对拿出来的元素做对比，也可以理解成比较次数
            for (int j=0;j<a.length -i -1;j++){
                //两层各拿出一个元素做对比，大于号表示前一个数比后一个数大，是升序排序；小于号是后一个数比前一个数大，表示降序；
                if (a[j]<a[j+1]){
                    //因为计算机不能直接交换两个数的位置，只能通过第三个数来帮助交换
                    int temp = a[j];
                    //交换两个数的位置
                    a[j] = a[j+1];
                    //交换位置
                    a[j+1] = temp;
                }
            }
        }
        //遍历数组a并打印数字
        for (int b : a){
            System.out.println(b);
        }
    }


    /**
     * 打印九九乘法口诀表
     */
    @Test
    public void chengFaBiao(){
        //第一层排序表示的是遍历整个数组的元素，每次取一个
        for (int i=1;i<= 9;i++){
            //第二层排序表示的是除了第一层拿出来的元素，剩下的一一对拿出来的元素做对比，也可以理解成比较次数
            for (int j=1;j<=i;j++){
                if (j < i){
                    System.out.print(j + "*" + i + "=" + i * j + " ");
                }else {
                    System.out.println(i + "*" + j + "=" + i * j + "\n");
                }
            }
        }
    }


    /**
     * 迭代器使用测试
     */
    @Test
    public void intertatorTest(){
        //创建一个列表集合
        Collection collection = new ArrayList();
        //往列表集合里添加元素
        collection.add(1);
        collection.add("你好吗？");
        collection.add("ture");
        collection.add(89);
        //创建一个迭代器
        Iterator iterator = collection.iterator();
        //如果迭代有元素就打印出来
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }



}
