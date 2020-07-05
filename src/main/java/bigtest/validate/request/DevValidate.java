package bigtest.validate.request;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class DevValidate {
    public static void validate(String _dev){
        if (StringUtils.isEmpty(_dev)){
            log.error("_dev设备制造商为空");
        }
    }
}
