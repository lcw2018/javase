package com.lcw.demo04.Calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * Create by chuanwen.li on 2019/6/22
 */
/*
    Calendar类的常用成员方法:
        public int get(int field)：返回给定日历字段的值。
        public void set(int field, int value)：将给定的日历字段设置为给定值。
        public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
        public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
    成员方法的参数:
        int field:日历类的字段,可以使用Calendar类的静态成员变量获取
            public static final int YEAR = 1;	年
            public static final int MONTH = 2;	月
            public static final int DATE = 5;	月中的某一天
            public static final int DAY_OF_MONTH = 5;月中的某一天
            public static final int HOUR = 10; 		时
            public static final int MINUTE = 12; 	分
            public static final int SECOND = 13;	秒
 */
public class Demo02Calendar {


    public static void main(String[] args) {


        // demo01();
        //demo02();
        //demo03();
          demo04();


    }

    /*
        public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
        把日历对象,转换为日期对象
     */

    private static void demo04() {

        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();

        Date time = c.getTime();

        System.out.println(time);//Sun Jun 23 22:06:51 CST 2019


    }




  /*
        public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
        把指定的字段增加/减少指定的值
        参数:
            int field:传递指定的日历字段(YEAR,MONTH...)
            int amount:增加/减少指定的值
                正数:增加
                负数:减少
     */

    private static void demo03() {


        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();

        //年份增加2
        c.add(Calendar.YEAR, 2);

        //月份减少3

        c.add(Calendar.MONTH, -3);


        int year = c.get(Calendar.YEAR);

        System.out.println(year);


        int month = c.get(Calendar.MONTH);

        System.out.println(month);


        int date = c.get(Calendar.DATE);
        System.out.println(date);


        System.out.println(Calendar.DAY_OF_MONTH);


    }

    /*
        public void set(int field, int value)：将给定的日历字段设置为给定值。
        参数:
            int field:传递指定的日历字段(YEAR,MONTH...)
            int value:给指定字段设置的值
     */

    private static void demo02() {

        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();

        c.set(Calendar.YEAR, 9999);

        c.set(Calendar.MONTH, 11);

        c.set(Calendar.DATE, 21);


        int year = c.get(Calendar.YEAR);

        System.out.println(year);//9999


        int month = c.get(Calendar.MONTH);


        System.out.println(month);//11

        int date = c.get(Calendar.DATE);

        System.out.println(date);//21


    }

    /*
          public int get(int field)：返回给定日历字段的值。
          参数:传递指定的日历字段(YEAR,MONTH...)
          返回值:日历字段代表的具体的值
       */
    private static void demo01() {

        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();


        int year = c.get(Calendar.YEAR);

        System.out.println(year);//2019


        int month = c.get(Calendar.MONTH);

        System.out.println(month);//5  月份的序号从0开始
        ////西方的月份0-11 东方:1-12

        int date = c.get(Calendar.DATE);


        System.out.println(date);//23


    }


}
