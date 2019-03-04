
package cn.itcast.webservice.cxf.server;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WeatherInterfaceService", targetNamespace = "http://server.cxf.webservice.itcast.cn/", wsdlLocation = "http://198.216.5.142:8080/webservice_06_xxf_server/ws/weather?wsdl")
public class WeatherInterfaceService
    extends Service
{

    private final static URL WEATHERINTERFACESERVICE_WSDL_LOCATION;
    private final static WebServiceException WEATHERINTERFACESERVICE_EXCEPTION;
    private final static QName WEATHERINTERFACESERVICE_QNAME = new QName("http://server.cxf.webservice.itcast.cn/", "WeatherInterfaceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://198.216.5.142:8080/webservice_06_xxf_server/ws/weather?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEATHERINTERFACESERVICE_WSDL_LOCATION = url;
        WEATHERINTERFACESERVICE_EXCEPTION = e;
    }

    public WeatherInterfaceService() {
        super(__getWsdlLocation(), WEATHERINTERFACESERVICE_QNAME);
    }

    public WeatherInterfaceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEATHERINTERFACESERVICE_QNAME, features);
    }

    public WeatherInterfaceService(URL wsdlLocation) {
        super(wsdlLocation, WEATHERINTERFACESERVICE_QNAME);
    }

    public WeatherInterfaceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEATHERINTERFACESERVICE_QNAME, features);
    }

    public WeatherInterfaceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WeatherInterfaceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WeatherInterface
     */
    @WebEndpoint(name = "WeatherInterfacePort")
    public WeatherInterface getWeatherInterfacePort() {
        return super.getPort(new QName("http://server.cxf.webservice.itcast.cn/", "WeatherInterfacePort"), WeatherInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherInterface
     */
    @WebEndpoint(name = "WeatherInterfacePort")
    public WeatherInterface getWeatherInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.cxf.webservice.itcast.cn/", "WeatherInterfacePort"), WeatherInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEATHERINTERFACESERVICE_EXCEPTION!= null) {
            throw WEATHERINTERFACESERVICE_EXCEPTION;
        }
        return WEATHERINTERFACESERVICE_WSDL_LOCATION;
    }

}
