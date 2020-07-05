package bigtest.validate.request;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class ImeioValidate {
    public static void validate(String _imeio){
        if (StringUtils.isEmpty(_imeio)){
            log.error("Android的_imeio为空");
        }
    }
}
