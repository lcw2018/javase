package day32_code.demo03;

/**
 * Create by chuanwen.li on 2019/7/2
 */
public interface MyInterfaceA {

    public abstract void methodA();

    public abstract void methodCommon();

    public default void methodDefault() {

        System.out.println("AAA");

    }


}
