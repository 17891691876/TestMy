package bigtest.validate.request.getother;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class OidValidate {
    public static void validate(String oid){
        if (StringUtils.isEmpty(oid)){
            log.error("oid值ios的OpenUDID为空");
        }else if(oid.length() != 40){
            log.error("oid值ios的OpenUDID长度非40位而是"+oid);
        }
    }
}
