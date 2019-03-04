package com.zjs.bwcx.webservice.socket.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * socket服务端
 * 
 * @ClassName SocketServer
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author sl
 * @Date 2017年8月8日 下午5:10:35
 * @version 1.0.0
 */
public class SocketServer {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {

        // 启动socket服务端
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("服务端已启动。。。");
        
        DataInputStream dataInputStream = null;
        
        DataOutputStream dataOutputStream = null;

        while (true) {
                
            try {
             // 监听客户端链接
                // accept()方法是阻塞方法
                Socket socket = serverSocket.accept();

                // 输入流，使用此流接受数据
                dataInputStream = new DataInputStream(socket.getInputStream());

                // 得到输出流，使用此流发送数据
                dataOutputStream = new DataOutputStream(socket.getOutputStream());

                // 城市名称
                String cityName = dataInputStream.readUTF();
                System.out.println("from client.." + cityName);

                // 查询天气
                // ...
                String result = "晴转阴";

                // 将天气查询结果发送给客户端
                dataOutputStream.writeUTF(result);
                System.out.println("to client..."+result);
            } catch (Exception e) {
               e.printStackTrace();
            }finally{
                //资源释放
                if(dataInputStream!=null){
                    
                    dataInputStream.close();
                }
                
                if (dataOutputStream!=null) {
                    
                    dataOutputStream.close();
                }
            }
            
        }

    }
}
