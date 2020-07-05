package bigtest.validate.request;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class Libra_groupValidate {
    public static void validate(String libra_group){
        if (StringUtils.isEmpty(libra_group)){
            log.error("libra_group参数为空");
        }
    }
}
