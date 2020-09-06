package bigtest.validate.request.getother;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class LabelValidate {
    public static void validate(String label){
        if (StringUtils.isEmpty(label)){
            log.error("label导航为空");
        }
    }
}
