package bigtest.validate.request.getother;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class SwShValidate {
    public static void validate(String sw,String sh){
        if (StringUtils.isEmpty(sw)){
            log.error("sw设备宽度为空");
        }
        if (StringUtils.isEmpty(sh)){
            log.error("sh设备高度为空");
        }
    }
}
