package com.lcw.demo02Recursion;

/*
    练习:
        使用递归计算阶乘
        n的阶乘：n! = n * (n-1) *...* 3 * 2 * 1

 */
public class Demo03Recursion {
    public static void main(String[] args) {

        int jc = jc(5);
        System.out.println(jc);


    }

    /*
          定义方法使用递归计算阶乘
          5的阶乘: 5! = 5*(5-1)*(5-2)*(5-3)*(5-4)=5*4*3*2*1
          递归结束的条件
              获取到1的时候结束
          递归的目的
              获取下一个被乘的数字(n-1)
          方法的参数发生变化
             */
    private static int jc(int n) {

        if (n == 1) {
            return 1;

        }

        return n * jc(n - 1);

    }


}
