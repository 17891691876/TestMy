package bigtest.validate.request.pm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PmSlotidValidate {
    public static void pmslotidvalidate(String slotid){
        if (StringUtils.isEmpty(slotid)){
            log.error("slotid为空");
        }
    }
}
