package com.lcw.demo06tryCatch;


/*
    JDK7的新特性
    在try的后边可以增加一个(),在括号中可以定义流对象
    那么这个流对象的作用域就在try中有效
    try中的代码执行完毕,会自动把流对象释放,不用写finally
    格式:
        try(定义流对象;定义流对象....){
            可能会产出异常的代码
        }catch(异常类变量 变量名){
            异常的处理逻辑
        }
 */


import java.io.*;

public class Demo02JDK7 {
    public static void main(String[] args) throws IOException {


        try (
               //1.创建一个字节输入流对象,构造方法中绑定要读取的数据源
                FileInputStream fis = new FileInputStream("D:\\my.JPG");

                //2.创建一个字节输出流对象,构造方法中绑定要写入的目的地
                FileOutputStream fos = new FileOutputStream("day19_Net\\my.JPG");

        ) {

            //可能会产出异常的代码

            int len = 0;
            byte[] bytes = new byte[1024];
                //3.使用字节输入流对象中的方法read读取文件
            while ((len = fis.read(bytes)) != -1) {
                //4.使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
                    fos.write(bytes);

            }


        } catch (IOException e) {
            //异常处理逻辑
            e.printStackTrace();

        }


    }
}