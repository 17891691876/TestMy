package bigtest.validate.request;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class MdValidate {
    public static void validate(String _md){
        if (StringUtils.isEmpty(_md)){
            log.error("_md设备型号为空");
        }
    }
}
