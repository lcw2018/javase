package day26_code.demo03;

/**
 * Create by chuanwen.li on 2019/6/24
 */
/*
题目要求：
定义一个方法，用来打印指定次数的HelloWorld。
 */
public class Demo03MethodPrint {


    public static void main(String[] args) {


        printCount(10);


    }

      /*
    三要素
    返回值类型：只是进行一大堆打印操作而已，没有计算，也没有结果要告诉调用处
    方法名称：printCount
    参数列表：到底要打印多少次？必须告诉我，否则我不知道多少次，没法打印。次数：int
     */

    private static void printCount(int count) {

        for (int i = 0; i < count; i++) {

            System.out.println("hello world!" + (i + 1));

        }


    }

}
