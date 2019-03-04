package cn.itcast.webservice.jaxws.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import cn.itcast.webservice.jaxws.server.WeatherInterfaceImpl;

public class Client2 {
    
    public static void main(String[] args) throws Exception {
        //服务的地址
        URL url = new URL("http://198.216.5.142:54321/weather");
        
        //创建
        QName qName = new QName("http://server.jaxws.webservice.itcast.cn/", "WeatherInterfaceImplService");
        
        //创建服务视图
        Service service = Service.create(url, qName);
        
        //得到服务端点
        WeatherInterfaceImpl weatherInterfaceImpl = service.getPort(WeatherInterfaceImpl.class);
        
        //通过服务端点调用服务方法
        String result = weatherInterfaceImpl.queryWeather("郑州");
        
        System.out.println(result);
    }
}
