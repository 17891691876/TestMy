package bigtest.validate.request.pm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PmOaidValidate {
    public static void pmoaidvalidate(String oaid){
        if(StringUtils.isEmpty(oaid)){
            log.error("oaid为空");
        }
    }
}
