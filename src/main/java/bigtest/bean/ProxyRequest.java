package bigtest.bean;

import lombok.Builder;
import lombok.Data;

import javax.servlet.http.Cookie;
@Builder
@Data
public class ProxyRequest {
    private String method;
    private String url;
    private String host;
    private Cookie cookie;
    private String userAgent;
    private String params;
}
