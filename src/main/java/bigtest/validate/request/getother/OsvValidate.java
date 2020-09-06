package bigtest.validate.request.getother;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class OsvValidate {
    public static void validate(String osv){
        if (StringUtils.isEmpty(osv)){
            log.error("osv系统版本为空");
        }
    }
}
