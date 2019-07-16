package day32_code.demo04;

/**
 * Create by chuanwen.li on 2019/7/2
 */
/*
代码当中体现多态性，其实就是一句话：父类引用指向子类对象。

格式：
父类名称 对象名 = new 子类名称();
或者：
接口名称 对象名 = new 实现类名称();
 */
public class Demo01Multi {

    public static void main(String[] args) {


        //使用多态的写法

        //左侧父类引用，指向右侧子类对象

        Zi obj = new Zi();


        obj.method();  //子类方法

        obj.methodFu();  //父类特有方法


    }

}
