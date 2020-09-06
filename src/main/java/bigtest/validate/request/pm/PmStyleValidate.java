package bigtest.validate.request.pm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PmStyleValidate {
    public static void pmstylevalidate(String style){
        if (StringUtils.isEmpty(style)){
            log.error("style为空");
        }
    }
}
