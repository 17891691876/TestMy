package bigtest.validate.request.getother;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class MacValidate {
    public static void validate(String _mac){
        if (StringUtils.isEmpty(_mac)){
            log.error("设备_mac为空");
        }
    }
}
