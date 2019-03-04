
package com.zjs.bwcx.webxml;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WeatherWebServiceHttpGet", targetNamespace = "http://WebXml.com.cn/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherWebServiceHttpGet {


    /**
     * <br /><h3>��ѯ������Ԥ��Web Services֧�ֵĹ�������л������Ϣ</h3><p>���������byProvinceName = ָ�����޻���ڵ�ʡ�ݣ���ΪALL������ʾ����ȫ�����У��������ݣ�һ��һά�ַ������� String()���ṹΪ����������(���д���)��</p><br />
     * 
     * @param byProvinceName
     * @return
     *     returns cn.com.webxml.ArrayOfString
     */
    @WebMethod
    @WebResult(name = "ArrayOfString", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public ArrayOfString getSupportCity(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "byProvinceName")
        String byProvinceName);

    /**
     * <br /><h3>��ñ�����Ԥ��Web Services֧�ֵ��ޡ�������ʡ�ݺͳ�����Ϣ</h3><p>����������ޣ� �������ݣ�һ��һά�ַ������� String()������Ϊ�޻����ʡ�ݵ����ơ�</p><br />
     * 
     * @return
     *     returns cn.com.webxml.ArrayOfString
     */
    @WebMethod
    @WebResult(name = "ArrayOfString", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public ArrayOfString getSupportProvince();

    /**
     * <br><h3>��ñ�����Ԥ��Web Services֧�ֵ��ޡ�������ʡ�ݺͳ�����Ϣ</h3><p>����������ޣ����أ�DataSet ��DataSet.Tables(0) Ϊ֧�ֵ��޺͹���ʡ�����ݣ�DataSet.Tables(1) Ϊ֧�ֵĹ�������л�������ݡ�DataSet.Tables(0).Rows(i).Item("ID") ������Ӧ DataSet.Tables(1).Rows(i).Item("ZoneID") �����<br />Tables(0)��ID = ID������Zone = ֧�ֵ��ޡ�ʡ�ݣ�Tables(1)��ID ������ZoneID = ��ӦTables(0)ID�������Area = ���л������AreaCode = ���л�������롣</p><br />
     * 
     * @return
     *     returns cn.com.webxml.DataSet
     */
    @WebMethod
    @WebResult(name = "DataSet", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public DataSet getSupportDataSet();

    /**
     * <br><h3>���ݳ��л�������Ʋ�ѯ���δ��������������������ڵ�����ʵ��������������ָ��</h3><p>���÷������£����������theCityName = ������������(������п���Ӣ��)����д���(������Ĭ��Ϊ�Ϻ���)���磺�Ϻ� �� 58367�����г��������ظ���ʹ�ó��д����ѯ(��ͨ�� getSupportCity �� getSupportDataSet ���)���������ݣ� һ��һά���� String(22)������23��Ԫ�ء�<br />String(0) �� String(4)��ʡ�ݣ����У����д��룬����ͼƬ���ƣ�������ʱ�䡣String(5) �� String(11)������� ���£��ſ�������ͷ������������ƿ�ʼͼƬ����(���³ƣ�ͼ��һ)���������ƽ���ͼƬ����(���³ƣ�ͼ���)�����ڵ�����ʵ��������������ָ����String(12) �� String(16)���ڶ���� ���£��ſ�������ͷ�����ͼ��һ��ͼ�����String(17) �� String(21)��������� ���£��ſ�������ͷ�����ͼ��һ��ͼ�����String(22) ����ѯ�ĳ��л�����Ľ��� <br /><a href="http://www.webxml.com.cn/images/weather.zip">��������ͼ��<img src="http://www.webxml.com.cn/images/download_w.gif" border="0" align="absbottom" /></a>(�������С�С�ߴ�) <a href="http://www.webxml.com.cn/zh_cn/weather_icon.aspx" target="_blank">����ͼ��˵��</a> <a href="http://www.webxml.com.cn/files/weather_eg.zip">���ô�����Ԥ��Web Servicesʵ������</a> (VB ASP.net 2.0)</p><br />
     * 
     * @param theCityName
     * @return
     *     returns cn.com.webxml.ArrayOfString
     */
    @WebMethod
    @WebResult(name = "ArrayOfString", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public ArrayOfString getWeatherbyCityName(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "theCityName")
        String theCityName);

    /**
     * <br><h3>���ݳ��л�������Ʋ�ѯ���δ��������������������ڵ�����ʵ��������������ָ����For��ҵ�û���</h3><p>���÷���ͬ getWeatherbyCityName�����������theUserID = ��ҵ�û�ID</p><br />
     * 
     * @param theCityName
     * @param theUserID
     * @return
     *     returns cn.com.webxml.ArrayOfString
     */
    @WebMethod
    @WebResult(name = "ArrayOfString", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public ArrayOfString getWeatherbyCityNamePro(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "theCityName")
        String theCityName,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "theUserID")
        String theUserID);

}
