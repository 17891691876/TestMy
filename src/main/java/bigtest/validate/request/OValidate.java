package bigtest.validate.request;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class OValidate {
    public static void validate(String o){
        if(StringUtils.isEmpty(o)){
            log.error("o运营商为空");
        }else if(!"1".equals(o) && !"0".equals(o)&& !"2".equals(o)&& !"3".equals(o)){
            log.error("o运营商取值非0，1，2，3而是为"+o);
        }
    }
}
