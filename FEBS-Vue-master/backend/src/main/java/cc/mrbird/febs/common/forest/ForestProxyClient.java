package cc.mrbird.febs.common.forest;

//import com.dtflys.forest.annotation.Request;

/**
 * forset远程工具代理类
 */
public interface ForestProxyClient {

//    @Request(url = "http://192.168.2.57/predict/ocr_system",dataType = "json")
    String simpleRequest(String imageBase64Str);

}
