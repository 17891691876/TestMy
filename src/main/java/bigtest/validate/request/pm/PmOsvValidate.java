package bigtest.validate.request.pm;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class PmOsvValidate {
    public static void pmosvalidate(String os_version){
        if (StringUtils.isEmpty("os_version")){
            log.error("os_version为空");
        {
             log.info("os_version为"+os_version); }
        }
    }
}
