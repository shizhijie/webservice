package com.zjs.bwcx.webservice.jaxws.server;

import javax.xml.ws.Endpoint;

public class Server {
    
    public static void main(String[] args) {
        //发送天气查询服务
        Endpoint.publish("http://198.216.5.142:12345/weather", new WeatherInterfaceImpl());
        System.out.println("发布webservice服务");
    }
}
