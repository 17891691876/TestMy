package bigtest.validate.request.pm;

import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PmOsValidate {

public static void pmosvalidate(String os){
    if(StringUtils.isEmpty(os)){
        log.error("os操作系统为空");
    }else if (!"IOS".equals(os) && !"Android".equals(os)) {
        log.error("os操作系统为" + os);
    }
    }
}
