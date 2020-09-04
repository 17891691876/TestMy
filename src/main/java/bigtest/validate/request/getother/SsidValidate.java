package bigtest.validate.request.getother;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

@Slf4j
public class SsidValidate {
    public static void validate(String ssid) throws UnsupportedEncodingException{

       String a = new String(Base64.decodeBase64(ssid), StandardCharsets.UTF_8);
        if (StringUtils.isEmpty(ssid)){
            log.error("ssid的wifi名称为空");
            return ;
        }else if(a != null){}

           // String a = new String(Base64.decodeBase64(ssid), StandardCharsets.UTF_8);
            log.error("ssid编码错误");

    }
}
