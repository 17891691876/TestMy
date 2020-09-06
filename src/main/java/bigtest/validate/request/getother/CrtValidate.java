package bigtest.validate.request.getother;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class CrtValidate {
    public static void validate(String crt){
        if (StringUtils.isEmpty(crt)){
            log.error("crt参数为空");
        }
    }
}
