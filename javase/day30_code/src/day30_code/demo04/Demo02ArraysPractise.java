package day30_code.demo04;

import java.util.Arrays;

/**
 * Create by chuanwen.li on 2019/6/26
 */

/*
题目：
请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
 */
public class Demo02ArraysPractise {


    public static void main(String[] args) {

        String str = "asddsldslffdfewkofkdls";


        // 如何进行升序排列：sort
        // 必须是一个数组，才能用Arrays.sort方法
        // String --> 数组，用toCharArray
        char[] chars = str.toCharArray();


        Arrays.sort(chars); //对字符数组升序排列


        // 需要倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {


            System.out.println(chars[i]);


        }


    }


}
