package bigtest.validate.request.getother;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class TimeZoneValidate {
    public static void validate(String time_zone){
        if (StringUtils.isEmpty(time_zone)){
            log.error("time_zone地区为空");
        }
    }
}
