package day30_code.demo02;

import java.util.Scanner;

/**
 * Create by chuanwen.li on 2019/6/26
 */

/*
题目：
键盘输入一个字符串，并且统计其中各种字符出现的次数。
种类有：大写字母、小写字母、数字、其他

思路：
1. 既然用到键盘输入，肯定是Scanner
2. 键盘输入的是字符串，那么：String str = sc.next();
3. 定义四个变量，分别代表四种字符各自的出现次数。
4. 需要对字符串一个字、一个字检查，String-->char[]，方法就是toCharArray()
5. 遍历char[]字符数组，对当前字符的种类进行判断，并且用四个变量进行++动作。
6. 打印输出四个变量，分别代表四种字符出现次数。
 */
public class Demo07StringCount {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        String input = sc.next();//获取键盘输入


        int countUpper = 0; //大写字母个数
        int countLower = 0; //小写字母个数
        int number = 0; //数字个数
        int other = 0; //其它字符个数


        char[] chars = input.toCharArray();


        for (int i = 0; i < chars.length; i++) {


            char ch = chars[i];

            if (ch >= 'A' && ch <= 'Z') {

                countUpper++;

            } else if (ch >= 'a' && ch <= 'z') {


                countLower++;
            } else if (ch >= '0' && ch <= '9') {

                number++;


            } else {

                other++;

            }





        }
        System.out.println("大写字母有：" + countUpper);
        System.out.println("小写字母有：" + countLower);
        System.out.println("数字有：" + number);
        System.out.println("其它有：" + other);


    }


}
