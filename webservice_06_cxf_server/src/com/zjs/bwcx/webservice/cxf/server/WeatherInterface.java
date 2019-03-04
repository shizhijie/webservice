package com.zjs.bwcx.webservice.cxf.server;

import javax.jws.WebService;

/**
 * SEI天气查询接口
 * @ClassName WeatherInterface
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author sl
 * @Date 2017年8月9日 上午10:16:57
 * @version 1.0.0
 */
@WebService
public interface WeatherInterface {
    //天气查询
    public String queryWeather(String cityName );

}
