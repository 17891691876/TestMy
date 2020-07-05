package bigtest.test;

import bigtest.bean.LoginRequest;
import bigtest.bean.ProxyRequest;
import bigtest.bean.ProxyResponse;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
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

    public ProxyResponse proxyPost(String  url, List<NameValuePair> params) throws UnsupportedEncodingException {
        ProxyResponse response = new ProxyResponse();
        // 初始化请求
        HttpPost httppost = new HttpPost(url);
        // 发起请求
        //StringEntity entity = new StringEntity(String.valueOf(loginrequestparam), "UTF-8");
        //log.info(JSON.toJSONString(loginrequestparam));
        httppost.setHeader("Content-Type", "application/x-www-form-urlencoded");
        httppost.setEntity(new UrlEncodedFormEntity(params,"UTF-8"));
        try (CloseableHttpResponse httpResponse = httpClient.execute(httppost)) {
            response.setContent(EntityUtils.toString(httpResponse.getEntity()));
        } catch (Exception e) {
            log.error("proxy err", e);
        }
        return response;
    }

}
