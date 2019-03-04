package cn.itcast.webservice.jaxws.client;

import cn.itcast.webservice.jaxws.server.WeatherInterfaceImpl;
import cn.itcast.webservice.jaxws.server.WeatherInterfaceImplService;

/**
 * 客户端
 * @ClassName Client
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author sl
 * @Date 2017年8月9日 上午10:47:01
 * @version 1.0.0
 */
public class Client {
    
    public static void main(String[] args) {
        //创建webService的服务视图
        WeatherInterfaceImplService weatherInterfaceImplService = new WeatherInterfaceImplService();
        //通过服务视图得到端点
        WeatherInterfaceImpl weatherInterfaceImpl = weatherInterfaceImplService.getWeatherInterfaceImplPort();
        //通过服务端点调用webservice接口
        //向服务端发送数据
        String result = weatherInterfaceImpl.queryWeather("北京");
        System.out.println("from server..."+result);
    }
}
