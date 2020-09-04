package bigtest.validate.request.pm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PmWifiValidate {
    public static void pmwifivalidate(String wifi){
        if (StringUtils.isEmpty(wifi)){
            log.error("wifi为空");
        }
    }
}
