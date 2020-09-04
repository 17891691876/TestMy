package bigtest.validate.request.getother;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class IdfaValidate {
    public static void validate(String _idfa){
        if (StringUtils.isEmpty(_idfa)){
            log.error("IOS的_idfa为空");
        }
    }
}
