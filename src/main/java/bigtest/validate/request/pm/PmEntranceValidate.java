package bigtest.validate.request.pm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PmEntranceValidate {
    public static void pmentrancevalidate(String entrances){
        if(StringUtils.isEmpty(entrances)){
            log.error("entrances为空");
        }
    }
}
