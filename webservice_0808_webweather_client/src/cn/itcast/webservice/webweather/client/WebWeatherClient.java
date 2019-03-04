package cn.itcast.webservice.webweather.client;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWebService;
import cn.com.webxml.WeatherWebServiceSoap;

/**
 * 公网天气查询客户端
 * @ClassName WebWeatherClient
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author sl
 * @Date 2017年8月8日 下午4:00:11
 * @version 1.0.0
 */
public class WebWeatherClient {
    
    public static void main(String[] args) {
        //创建服务视图
        WeatherWebService weatherWebService = new WeatherWebService();
        //通过服务视图得到服务端点
        WeatherWebServiceSoap weatherWebServiceSoap = weatherWebService.getWeatherWebServiceSoap();
        //通过服务端点调用服务方法
        ArrayOfString arrayOfString = weatherWebServiceSoap.getWeatherbyCityName("北京");
        
        List<String> results = arrayOfString.getString();
        
        System.out.println("开始遍历从公网查询到的天气....");
        
        for(String result:results){
            System.out.println(result);
        }
    }
    
}
