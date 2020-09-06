package bigtest.validate.request.rm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RmIsSuccessValueValidate {
    public static void rmissuccessvalidate(String is_success){
        if (StringUtils.isEmpty(is_success)){
            log.error("is_success为空");
        if(!"true".equals(is_success) && !"false".equals(is_success)){
            log.info("is_success为"+is_success);
        }
        }
    }
}
