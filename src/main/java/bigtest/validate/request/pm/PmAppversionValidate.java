package bigtest.validate.request.pm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PmAppversionValidate {
    public static void pmappversionvalidate(String app_version){
        if(StringUtils.isEmpty(app_version)){
            log.error("app_version为空");
        }
    }
}
