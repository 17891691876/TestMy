package bigtest.validate.request.pm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PmFidValidate {
    public static void pmfidvalidate(String fid){
        if(StringUtils.isEmpty(fid)){
            log.error("fid为空");
        }
    }
}
