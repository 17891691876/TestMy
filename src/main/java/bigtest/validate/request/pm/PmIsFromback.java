package bigtest.validate.request.pm;

import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PmIsFromback {
    public static void pmisfromback(String is_fromback){
        if (StringUtils.isEmpty(is_fromback)){
            log.error("is_fromback为空");

        }
    }
}
