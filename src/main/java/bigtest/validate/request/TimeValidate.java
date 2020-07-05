package bigtest.validate.request;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class TimeValidate {
    public static void validate(String time){
        if (StringUtils.isEmpty(time)){
            log.error("time时间戳为空");
        }else if(time.length() != 10 && time.length() != 13){
            log.error("time时间戳长度非10位而是"+time);
        }
    }
}
