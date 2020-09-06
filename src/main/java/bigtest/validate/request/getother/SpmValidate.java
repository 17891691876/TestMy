package bigtest.validate.request.getother;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class SpmValidate {
    public static void validate(String spm){
        if (StringUtils.isEmpty(spm)){
            log.error("spm为空");
        }else if(spm.length() < 22 ){
            log.error("spm长度小于22位而是"+spm);
        }
    }
}
