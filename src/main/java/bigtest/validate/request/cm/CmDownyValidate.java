package bigtest.validate.request.cm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CmDownyValidate {
    public static void cmdownyvalidate(String downy){
        if (StringUtils.isEmpty(downy)){
            log.error("downx为空");
        }
    }
}
