package bigtest.validate.request.pm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PmExposureTypeValidate {
    public static void pmexposuretypevalidate(String expsure_type){
        if(StringUtils.isEmpty(expsure_type)){
            log.error("exposure_type为空");

        }
        log.info("我就看看啊");
    }
}
