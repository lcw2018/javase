package day32_code.demo01;

/**
 * Create by chuanwen.li on 2019/7/2
 */
public interface MyInterfacePrivateB {

    public static void methodStatic1() {

        System.out.println("静态方法1！");

        methodStaticCommon();


    }


    public static void methodStatic2() {


        System.out.println("静态方法2！");


        methodStaticCommon();


    }


    private static void methodStaticCommon() {


        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");


    }


}
