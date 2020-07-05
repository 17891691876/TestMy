package bigtest.validate.request;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
@Slf4j
public class NightValidate {
    public static void validate(String night){
        if(StringUtils.isEmpty(night)){
            log.error("night日夜间模式为空");
        }else if(!"1".equals(night) && !"0".equals(night)){
            log.error("night日夜间模式取值非1和0而是为"+night);
        }
    }
}
