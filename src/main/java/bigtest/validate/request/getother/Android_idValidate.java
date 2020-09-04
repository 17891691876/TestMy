package bigtest.validate.request.getother;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class Android_idValidate {
    public static void validate(String android_id){
        if (StringUtils.isEmpty(android_id)){
            log.error("android_id参数为空");
        }
    }
}
