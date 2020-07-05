package bigtest.validate.request;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class PxwPxhValidate {
    public static void validate(String pxw,String pxh){
        if (StringUtils.isEmpty(pxw)){
            log.error("pxw设备宽度为空");
        }
        if (StringUtils.isEmpty(pxh)){
            log.error("pxh设备高度为空");
        }
    }
}
