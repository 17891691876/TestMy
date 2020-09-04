package bigtest.validate.request.getother;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class SignValidate {
    public static void validate(String sign){
        if (StringUtils.isEmpty(sign)){
            log.error("sign参数为空");
        }else if(sign.length() != 32){
            log.error("sign长度非32位而是"+sign);
        }
    }
}
