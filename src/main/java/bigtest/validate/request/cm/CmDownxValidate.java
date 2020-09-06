package bigtest.validate.request.cm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CmDownxValidate {
    public static void cmdowxvalidate(String downx){
        if (StringUtils.isEmpty(downx)){
            log.error("downx为空");
        }
    }
}
