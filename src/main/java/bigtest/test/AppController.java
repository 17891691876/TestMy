package bigtest.test;


import bigtest.Utils.JsonUtils;
import bigtest.bean.ProxyResponse;
import bigtest.validate.request.cm.GetCmRequestValueValidate;
import bigtest.validate.request.getother.GetRequestValueValidate;
import bigtest.validate.request.rm.GetRmRequestValueValidate;
import bigtest.validate.request.pm.GetPmRequestValueValidate;
import bigtest.validate.request.xm.GetXmRequestValueValidate;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;


@Slf4j
@RestController
public class AppController {

    @Autowired
    private ProxyService proxyService;
    @Autowired  //注入GetRequestValueValidate
    private GetRequestValueValidate getRequestValueValidate;
    @Autowired
    private GetRmRequestValueValidate getRmRequestValueValidate;
    @Autowired
    private GetPmRequestValueValidate getPmRequestValueValidate;
    @Autowired
    private GetCmRequestValueValidate getCmRequestValueValidate;
    @Autowired
    private GetXmRequestValueValidate getXmRequestValueValidate;
    @Autowired
    private GetOtherresponse getOtherresponse;

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
        String host = servletRequest.getHeader("host");
        //url = url.replace(7,21,host);
        log.info(String.valueOf(url));
        //发起请求，获取返回值
        ProxyResponse response = proxyService.proxyGet(String.valueOf(url));
        getOtherresponse.getResponseValidate(response);
        return response.getContent();

    }

    //rm
    @GetMapping(value = "/rm", produces = "text/plain;charset=UTF-8")
    public String appRm(
            HttpServletRequest servletRequest
    ) throws IOException {
        getRmRequestValueValidate.getRmRequestValueValidate(servletRequest);
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


    //pm
    @GetMapping(value = "/pm", produces = "text/plain;charset=UTF-8")
    public String appPm(
            HttpServletRequest servletRequest
    ) throws IOException {
        getPmRequestValueValidate.getPmRequestValueValidate(servletRequest);
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
        String request_id = servletRequest.getParameter("request_id");
        getOtherresponse.savePmNum(request_id);
        return response.getContent();

    }


    //cm
    @GetMapping(value = "/cm", produces = "text/plain;charset=UTF-8")
    public String appCm(
            HttpServletRequest servletRequest
    ) throws IOException {
        getCmRequestValueValidate.getCmRequestValueValidate(servletRequest);
        //获取请求的url
        StringBuffer url = servletRequest.getRequestURL();
        if (servletRequest.getQueryString() != null) {
            url.append("?").append(servletRequest.getQueryString());
        }

        String host = servletRequest.getHeader("host");
        url = url.replace(7, 21, "e-goblin-test.hupu.com");
        log.info(String.valueOf(url));
        //发起请求，获取返回值
        ProxyResponse response = proxyService.proxyGet(String.valueOf(url));
        return response.getContent();
    }


    //xm
    @GetMapping(value = "/xm", produces = "text/plain;charset=UTF-8")
    public String appXm(
            HttpServletRequest servletRequest
    ) throws IOException {
        getXmRequestValueValidate.getXmRequestValueValidate(servletRequest);
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

    //gdt
//    @GetMapping()
//    public String gdtresponse(HttpServletRequest servletRequest,HttpServletResponse response) throws InterruptedException {
//
//        String newsloatid = servletRequest.getParameter("sloat_id");
//        String old = "";
//        String path="D://fmk/mfkj";
//        //读取json文件转换成字符串
//        JsonUtils.getJson(path);
//
//        JsonUtils.writeJsonFile(newsloatid,path);
//
//
//        String url = "127.0.0.1:8090/gdttest";
//        Thread.sleep(10);
//        ProxyResponse response = proxyService.proxyGet(url);
//        return response.getContent();
//    }


    //login
//    @PostMapping(value = "/1/7.5.12/bplapi/user/v1/loginByEmailPassword")
//    public String appLogin(HttpServletRequest servletRequest) throws UnsupportedEncodingException {
//        StringBuffer url = servletRequest.getRequestURL();
//
//        if (servletRequest.getQueryString() != null){
//            url.append("?").append(servletRequest.getQueryString());
//        }
//        String host = servletRequest.getHeader("host");
//        url = url.replace(7,21,host);
//
//        List<NameValuePair> loginrequestparma = new ArrayList<NameValuePair>();
//        //LoginRequest loginrequestparma = new LoginRequest();
//
//        loginrequestparma.add(new BasicNameValuePair("clientId",servletRequest.getParameter("clientId")));
//        loginrequestparma.add(new BasicNameValuePair("crt",servletRequest.getParameter("crt")));
//        loginrequestparma.add(new BasicNameValuePair("night",servletRequest.getParameter("night")));
//        loginrequestparma.add(new BasicNameValuePair("channel",servletRequest.getParameter("channel")));
//        loginrequestparma.add(new BasicNameValuePair("sign",servletRequest.getParameter("sign")));
//        loginrequestparma.add(new BasicNameValuePair("_ssid",servletRequest.getParameter("_ssid")));
//        loginrequestparma.add(new BasicNameValuePair("_imei",servletRequest.getParameter("_imei")));
//        loginrequestparma.add(new BasicNameValuePair("time_zone",servletRequest.getParameter("time_zone")));
//        loginrequestparma.add(new BasicNameValuePair("bddid",servletRequest.getParameter("bddid")));
//        loginrequestparma.add(new BasicNameValuePair("password",servletRequest.getParameter("password")));
//        loginrequestparma.add(new BasicNameValuePair("client",servletRequest.getParameter("client")));
//        loginrequestparma.add(new BasicNameValuePair("timeline",servletRequest.getParameter("timeline")));
//        loginrequestparma.add(new BasicNameValuePair("dace_ssid",servletRequest.getParameter("dace_ssid")));
//        loginrequestparma.add(new BasicNameValuePair("android_id",servletRequest.getParameter("android_id")));
//        loginrequestparma.add(new BasicNameValuePair("oaid",servletRequest.getParameter("oaid")));
//        loginrequestparma.add(new BasicNameValuePair("cid",servletRequest.getParameter("cid")));
//        loginrequestparma.add(new BasicNameValuePair("username",servletRequest.getParameter("username")));
//
//
//        //loginrequestparma.add(servletRequest.getParameter("clientId"));
////        loginrequestparma.setCrt(servletRequest.getParameter("crt"));
////        loginrequestparma.setNight(servletRequest.getParameter("night"));
////        loginrequestparma.setChannel(servletRequest.getParameter("channel"));
////        loginrequestparma.setSign(servletRequest.getParameter("sign"));
////        loginrequestparma.set_ssid(servletRequest.getParameter("_ssid"));
////        loginrequestparma.set_imei(servletRequest.getParameter("_imei"));
////        loginrequestparma.setTime_zone(servletRequest.getParameter("time_zone"));
////        loginrequestparma.setBddid(servletRequest.getParameter("bddid"));
////        loginrequestparma.setPassword(servletRequest.getParameter("password"));
////        loginrequestparma.setClient(servletRequest.getParameter("client"));
////        loginrequestparma.setTimeline(servletRequest.getParameter("timeline"));
////        loginrequestparma.setDace_ssid(servletRequest.getParameter("dace_ssid"));
////        loginrequestparma.setAndroid_id(servletRequest.getParameter("android_id"));
////        loginrequestparma.setOaid(servletRequest.getParameter("oaid"));
////        loginrequestparma.setCid(servletRequest.getParameter("cid"));
////        loginrequestparma.setUsername(servletRequest.getParameter("username"));
//
//        ProxyResponse response = proxyService.proxyPost(String.valueOf(url),loginrequestparma);
//
//        log.info("ssssssssssssss"+response);
//        return response.getContent();
//    }
}


