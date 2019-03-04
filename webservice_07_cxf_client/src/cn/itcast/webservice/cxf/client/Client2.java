package cn.itcast.webservice.cxf.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import cn.itcast.webservice.cxf.server.WeatherInterface;

public class Client2 {
    
    public static void main(String[] args) throws Exception {
        //服务的地址
        URL url = new URL("http://198.216.5.142:8080/webservice_06_cxf_server/ws/weather?wsdl");
        
        //创建
        QName qName = new QName("http://server.cxf.webservice.itcast.cn/", "WeatherInterfaceService");
        
        //创建服务视图
        Service service = Service.create(url, qName);
        
        //得到服务端点
        WeatherInterface weatherInterface = service.getPort(WeatherInterface.class);
        
        //通过服务端点调用服务方法
        String result = weatherInterface.queryWeather("郑州");
        
        System.out.println(result);
    }
}
