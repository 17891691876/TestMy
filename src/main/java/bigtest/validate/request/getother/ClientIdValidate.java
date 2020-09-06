package bigtest.validate.request.getother;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class ClientIdValidate {
    public static void validate(String clientId){
        if (StringUtils.isEmpty(clientId)){
            log.error("clientId设备唯一id为空");
        }
    }
}
