package cn.itcast.webservice.socket.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * socket客户端
 * 
 * @ClassName SocketClient
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author sl
 * @Date 2017年8月8日 下午5:30:10
 * @version 1.0.0
 */
public class SocketClient {

    public static void main(String[] args) throws UnknownHostException, IOException {

        // 创建socket链接
        Socket socket = null;
        
        DataOutputStream dataOutputStream = null;
        
        DataInputStream dataInputStream = null;
        
        try {
            
            socket = new Socket("198.216.5.142", 12345);
            
            // 发送数据
            // 得到输出流
            dataOutputStream = new DataOutputStream(socket.getOutputStream());

            // 发送城市名称
            String cityName = "北京";
            dataOutputStream.writeUTF(cityName);
            System.out.println("to server..." + cityName);

            // 接收数据
            // 得到输入流
            dataInputStream = new DataInputStream(socket.getInputStream());
            //接收服务端返回的天气查询结果
            String result = dataInputStream.readUTF();
            System.out.println("from server..."+result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
            if (socket!=null) {
                socket.close();
            }
            if (dataInputStream!=null) {
                dataInputStream.close();
            }
            if (dataOutputStream!=null) {
                dataOutputStream.close();
            }
        }
    }
}
