package bigtest.test;


import bigtest.bean.ProxyResponse;
import bigtest.validate.request.GetRequestValueValidate;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



@Slf4j
@RestController
public class AppController {

    @Autowired
    private ProxyService proxyService;
    @Autowired  //注入GetRequestValueValidate
    private GetRequestValueValidate getRequestValueValidate;


    @GetMapping(value = "/{projectId}/{version}/interfaceAd/getOther", produces = "application/json; charset=UTF-8")
    public String app(
            HttpServletRequest servletRequest
    ) throws IOException {
        getRequestValueValidate.getRequestValueValidate(servletRequest);
        //获取请求的url
        StringBuffer url = servletRequest.getRequestURL();
        log.info(String.valueOf(url));
        if (servletRequest.getQueryString() != null){
            url.append("?").append(servletRequest.getQueryString());
        }
        //String host = servletRequest.getHeader("host");
        String host = "goblin-test.hupu.com";
        url = url.replace(7,22,host);
        log.info(String.valueOf(url));
        //发起请求，获取返回值
        ProxyResponse response = proxyService.proxyGet(String.valueOf(url));
        return response.getContent();

    }

    //pm
    @GetMapping(value = "/pm", produces = "text/plain;charset=UTF-8")
    public String appPm(
            HttpServletRequest servletRequest
    ) throws IOException {

        //获取请求的url
        StringBuffer url = servletRequest.getRequestURL();
        if (servletRequest.getQueryString() != null){
            url.append("?").append(servletRequest.getQueryString());
        }

        String host = servletRequest.getHeader("host");
        url = url.replace(7,21,"e-goblin-test.hupu.com");
        log.info(String.valueOf(url));
        //发起请求，获取返回值
        ProxyResponse response = proxyService.proxyGet(String.valueOf(url));
        return response.getContent();

    }



    @PostMapping(value = "/{projectId}/{version}/bplapi/user/v1/loginByEmailPassword")
    public String login(HttpServletRequest servletRequest) {

        List<BasicNameValuePair> loginrequestparma = new ArrayList<BasicNameValuePair>();
        loginrequestparma.add(new BasicNameValuePair("clientId",servletRequest.getParameter("clientId")));
        loginrequestparma.add(new BasicNameValuePair("crt",servletRequest.getParameter("crt")));
        loginrequestparma.add(new BasicNameValuePair("night",servletRequest.getParameter("night")));
        loginrequestparma.add(new BasicNameValuePair("channel",servletRequest.getParameter("channel")));
        loginrequestparma.add(new BasicNameValuePair("sign",servletRequest.getParameter("sign")));
        loginrequestparma.add(new BasicNameValuePair("_ssid",servletRequest.getParameter("_ssid")));
        loginrequestparma.add(new BasicNameValuePair("_imei",servletRequest.getParameter("_imei")));
        loginrequestparma.add(new BasicNameValuePair("time_zone",servletRequest.getParameter("time_zone")));
        loginrequestparma.add(new BasicNameValuePair("bddid",servletRequest.getParameter("bddid")));
        loginrequestparma.add(new BasicNameValuePair("password",servletRequest.getParameter("password")));
        loginrequestparma.add(new BasicNameValuePair("client",servletRequest.getParameter("client")));
        loginrequestparma.add(new BasicNameValuePair("timeline",servletRequest.getParameter("timeline")));
        loginrequestparma.add(new BasicNameValuePair("dace_ssid",servletRequest.getParameter("dace_ssid")));
        loginrequestparma.add(new BasicNameValuePair("android_id",servletRequest.getParameter("android_id")));
        loginrequestparma.add(new BasicNameValuePair("oaid",servletRequest.getParameter("oaid")));
        loginrequestparma.add(new BasicNameValuePair("cid",servletRequest.getParameter("cid")));
        loginrequestparma.add(new BasicNameValuePair("username",servletRequest.getParameter("username")));

        //String  uri = "https://games.mobileapi.hupu.com/1/7.5.12/bplapi/user/v1/loginByEmailPassword?client=c5d77e27f1bb726b";
        StringBuffer url = servletRequest.getRequestURL();
        log.info(String.valueOf(url));
        if (servletRequest.getQueryString() != null){
            url.append("?").append(servletRequest.getQueryString());
        }
        Cookie[] cookie = servletRequest.getCookies();
        String Ua = servletRequest.getHeader("User-Agent");
        String jsonStr = proxyService.httpPost(String.valueOf(url),loginrequestparma,cookie,Ua); //post请求
        return jsonStr;
    }
}


