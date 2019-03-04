package cn.itcast.webservice.jaxws.server;

import javax.jws.WebService;

/**
 * SEI天气查询接口实现类
 * @ClassName WeatherInterfaceImpl
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author sl
 * @Date 2017年8月9日 上午10:19:30
 * @version 1.0.0
 */
@WebService
public class WeatherInterfaceImpl implements WeatherInterface {

    @Override
    public String queryWeather(String cityName) {
        //接收客户端发送过来的数据
        System.out.println("from client..."+cityName);
        String result = "晴转阴";
        //向客户端返回天气查询的结果
        return result;
    }
    
}
