package com.lcw.demo01File;

import java.io.File;

/*
    File类遍历(文件夹)目录功能
        - public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
        - public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。

    注意:
        list方法和listFiles方法遍历的是构造方法中给出的目录
        如果构造方法中给出的目录的路径不存在,会抛出空指针异常
        如果构造方法中给出的路径不是一个目录,也会抛出空指针异常
 */
public class Demo06File {


    public static void main(String[] args) {
        show1();
        show2();


    }

    /*
        public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
        遍历构造方法中给出的目录,会获取目录中所有的文件/文件夹,把文件/文件夹封装为File对象,多个File对象存储到File数组中
     */
    private static void show2() {
        File file = new File("D:\\Idea_work\\based-code\\day17_FileAndRecursion\\src\\com\\lcw\\demo01File");
        File[] files = file.listFiles();
        for (File f :
                files) {
            System.out.println(f);//D:\Idea_work\based-code\day17_FileAndRecursion\src\com\lcw\demo01File\1.txt ...
            System.out.println(f.getName());
        }

    }

  /*
        public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
        遍历构造方法中给出的目录,会获取目录中所有文件/文件夹的名称,把获取到的多个名称存储到一个String类型的数组中
     */

    private static void show1() {

        //File file1 = new File("D:\\Idea_work\\based-code\\day17_FileAndRecursion\\src\\com\\lcw\\demo01File\\Demo06File.java");
        //Exception in thread "main" java.lang.NullPointerException //不能使用在文件上
        // File file2 = new File("D:\\Idea_work\\based-code\\day17_FileAndRecursion\\src\\com\\lcw\\demo01");
        //Exception in thread "main" java.lang.NullPointerException ,路径不存在

        File file = new File("D:\\Idea_work\\based-code\\day17_FileAndRecursion\\src\\com\\lcw\\demo01File");
        String[] list1 = file.list();
        for (String f :
                list1) {
            System.out.println(f);//Demo01File.java ...
        }


    }
}
