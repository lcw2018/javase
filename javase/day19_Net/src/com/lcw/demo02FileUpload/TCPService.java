package com.lcw.demo02FileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    文件上传案例服务器端:读取客户端上传的文件,保存到服务器的硬盘,给客户端回写"上传成功"

    明确:
        数据源:客户端上传的文件
        目的地:服务器的硬盘 g:\\upload\\my.JPG

    实现步骤:
        1.创建一个服务器ServerSocket对象,和系统要指定的端口号
        2.使用ServerSocket对象中的方法accept,获取到请求的客户端Socket对象
        3.使用Socket对象中的方法getInputStream,获取到网络字节输入流InputStream对象
        4.判断d:\\upload文件夹是否存在,不存在则创建
        5.创建一个本地字节输出流FileOutputStream对象,构造方法中绑定要输出的目的地
        6.使用网络字节输入流InputStream对象中的方法read,读取客户端上传的文件
        7.使用本地字节输出流FileOutputStream对象中的方法write,把读取到的文件保存到服务器的硬盘上
        8.使用Socket对象中的方法getOutputStream,获取到网络字节输出流OutputStream对象
        9.使用网络字节输出流OutputStream对象中的方法write,给客户端回写"上传成功"
        10.释放资源(FileOutputStream,Socket,ServerSocket)
 */
public class TCPService {


    public static void main(String[] args) throws IOException {

        // 1.创建一个服务器ServerSocket对象,和系统要指定的端口号
        ServerSocket serverSocket = new ServerSocket(8808);

        // 2.使用ServerSocket对象中的方法accept,获取到请求的客户端Socket对象
        Socket accept = serverSocket.accept();
       // 3.使用Socket对象中的方法getInputStream,获取到网络字节输入流InputStream对象
        InputStream is = accept.getInputStream();
       //4.判断d:\\upload文件夹是否存在,不存在则创建
        File file = new File("g:\\upload");
        if (!file.exists()) {
            file.mkdirs();
        }

       // 5.创建一个本地字节输出流FileOutputStream对象,构造方法中绑定要输出的目的地
        FileOutputStream fos = new FileOutputStream(file+"\\my.JPG");







        int len = 0;
        byte[] bytes = new byte[1024];
        // 6.使用网络字节输入流InputStream对象中的方法read,读取客户端上传的文件
        while ((len = is.read(bytes)) != -1) {
// 7.使用本地字节输出流FileOutputStream对象中的方法write,把读取到的文件保存到服务器的硬盘上
            fos.write(bytes, 0, len);


        }
      //  8.使用Socket对象中的方法getOutputStream,获取到网络字节输出流OutputStream对象
        OutputStream os = accept.getOutputStream();
      // 9.使用网络字节输出流OutputStream对象中的方法write,给客户端回写"上传成功"
        os.write("文件上传成功！".getBytes());


        //10.释放资源(FileOutputStream,Socket,ServerSocket)
        fos.close();
        serverSocket.close();
        accept.close();

    }
}
