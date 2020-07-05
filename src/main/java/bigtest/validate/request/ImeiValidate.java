package bigtest.validate.request;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class ImeiValidate {
    public static void validate(String _imei){
        if (StringUtils.isEmpty(_imei)){
            log.error("Android的_imei为空");
        }
    }
}
