package com.lcw.demo10.WaitAndNotify;

/*
    进入到TimeWaiting(计时等待)有两种方式
    1.使用sleep(long m)方法,在毫秒值结束之后,线程睡醒进入到Runnable/Blocked状态
    2.使用wait(long m)方法,wait方法如果在毫秒值结束之后,还没有被notify唤醒,就会自动醒来,线程睡醒进入到Runnable/Blocked状态

    唤醒的方法:
         void notify() 唤醒在此对象监视器上等待的单个线程。
         void notifyAll() 唤醒在此对象监视器上等待的所有线程。
 */
public class Demo02WaitAndNotify {


    public static void main(String[] args) {

        //创建锁对象，保证唯一
        Object obj = new Object();

        //创建一个买家线程（消费者）
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        while (true) {
                            synchronized (obj) {//保证等待和唤醒只有一个线程执行，需要用到同步技术
                                System.out.println("顾客1告知生产者需要的包子种类和数量");
                                try {
                                    //调用wait方法,放弃cpu的执行,进入到WAITING状态(无限等待)
                                    obj.wait();//java.lang.IllegalMonitorStateException
                                    // 只有锁对象才能调用wait和notify方法
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                //唤醒后执行的代码
                                System.out.println("包子做好了，顾客1开吃");
                                System.out.println("-------------------");
                            }

                        }


                    }
                }


        ).start();

        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        while (true) {
                            synchronized (obj) {//保证等待和唤醒只有一个线程执行，需要用到同步技术
                                System.out.println("顾客2告知生产者需要的包子种类和数量");
                                try {
                                    //调用wait方法,放弃cpu的执行,进入到WAITING状态(无限等待)
                                    obj.wait();//java.lang.IllegalMonitorStateException
                                    // 只有锁对象才能调用wait和notify方法
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                //唤醒后执行的代码
                                System.out.println("包子做好了，顾客2开吃");
                                System.out.println("-------------------");
                            }

                        }


                    }
                }


        ).start();



        //创建一个老板线程（生产者）
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        while (true) {

                            try {//花费5秒钟做包子
                                Thread.sleep(5000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();


                            }
                            //保证等待和唤醒只有一个线程执行，需要用到同步技术
                            synchronized (obj) {
                                System.out.println("5秒钟后老板将包子做好，告知顾客可以吃包子了");
                                //做好包子之后，调用notify方法，唤醒顾客吃包子
                               // obj.notify();//如果有多个顾客等待吃包子，随机唤醒一个
                                  obj.notifyAll();//唤醒所有顾客吃包子
                                // 只有锁对象才能调用wait和notify方法
                            }
                        }


                    }
                }


        ).start();
    }
}
