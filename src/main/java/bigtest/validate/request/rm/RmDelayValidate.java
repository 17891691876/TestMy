package bigtest.validate.request.rm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j

public class RmDelayValidate {
    public static void rmdelayvalidate(String delay){
        if (StringUtils.isEmpty(delay)){
            log.error("delay为空");
        }
    }
}
