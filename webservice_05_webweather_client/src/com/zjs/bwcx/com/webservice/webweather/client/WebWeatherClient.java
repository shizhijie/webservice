package com.zjs.bwcx.com.webservice.webweather.client;

import java.util.List;

import com.zjs.bwcx.com.webxml.ArrayOfString;
import com.zjs.bwcx.com.webxml.WeatherWebService;
import com.zjs.bwcx.com.webxml.WeatherWebServiceSoap;

/**
 * 公网天气查询
 * @ClassName WebWeatherClient
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author sl
 * @Date 2017年8月9日 下午3:00:45
 * @version 1.0.0
 */
public class WebWeatherClient {
    
    public static void main(String[] args) {
        //创建公网服务视图
        WeatherWebService weatherWebService = new WeatherWebService();
        //根据服务视图得到服务端点
        WeatherWebServiceSoap weatherWebServiceSoap = weatherWebService.getWeatherWebServiceSoap();
        //通过服务端点调用服务
        ArrayOfString arrayOfString = weatherWebServiceSoap.getWeatherbyCityName("北京");
        
        List<String> strings = arrayOfString.getString();
        
        //遍历公网天气
        for(String string:strings){
            System.out.println(string);
        }
    }
}
