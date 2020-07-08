package bigtest.test;

import bigtest.bean.ProxyResponse;

import lombok.extern.slf4j.Slf4j;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;

import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


@Slf4j
@Service
public class ProxyService {
    private static CloseableHttpClient httpClient = HttpClientBuilder.create().build();
    public ProxyResponse proxyGet(String  url) {
        ProxyResponse response = new ProxyResponse();
        // 初始化请求
        HttpGet httpGet = new HttpGet(url);
        // 发起请求
        try (CloseableHttpResponse httpResponse = httpClient.execute(httpGet)) {
            response.setContent(EntityUtils.toString(httpResponse.getEntity()));
        } catch (Exception e) {
            log.error("proxy err", e);
        }
        return response;
    }

//    public String proxyPost(String  url, List<NameValuePair> params) throws UnsupportedEncodingException {
//        String response = "";
//        // 初始化请求
//        HttpPost httppost = new HttpPost(url);
//
//        // 发起请求
////        StringEntity entity = new StringEntity(String.valueOf(params), "UTF-8");
////        log.info(String.valueOf(params));
//        httppost.setHeader("Content-Type", "application/x-www-form-urlencoded");
//        httppost.setEntity(new UrlEncodedFormEntity(params,"UTF-8"));
//        try (CloseableHttpResponse httpResponse = httpClient.execute(httppost)) {
//            HttpEntity entity = httpResponse.getEntity();
//            if (entity != null) {
//                InputStream instreams = entity.getContent();
//                response = convertStreamToString(instreams);
//
//            }
//            //response.setContent(EntityUtils.toString(httpResponse.getEntity()));
//        } catch (Exception e) {
//            log.error("proxy err", e);
//        }
//        //log.info(response.getContent());
//        return response;
//    }

    public  String  httpPost(String uri, List<BasicNameValuePair> params, Cookie cookie[],String Ua) {
        String result = "";
        try {

            //CloseableHttpClient httpclients = HttpClients.createDefault();
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(uri);
            httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded"); // 添加请求头
            httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
            httpPost.addHeader("Cookie", String.valueOf(cookie));
            httpPost.addHeader("User-Agent",Ua);
            System.out.println(httpPost);
            HttpResponse response = httpclient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                InputStream instreams = entity.getContent();
                result = convertStreamToString(instreams);
                System.out.println(result);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return result;
    }



    public static String convertStreamToString(InputStream is) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();

        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

}
