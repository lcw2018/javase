package com.lcw.demo01.getName;

/*
    线程的名称:
        主线程: main
        新线程: Thread-0,Thread-1,Thread-2
 */

public class Demo01GetThreadName {

    public static void main(String[] args) {
      //创建Thread类的子类对象实例
        MyThread myThread = new MyThread();
        //开启线程，执行run方法中的逻辑操作
        myThread.start();
        new MyThread().start();
        new MyThread().start();
        //链式编程
        System.out.println(Thread.currentThread().getName());


    }


}
