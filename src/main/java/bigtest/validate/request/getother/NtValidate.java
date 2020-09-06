package bigtest.validate.request.getother;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class NtValidate {
    public static void validate(String nt){
        if(StringUtils.isEmpty(nt)){
            log.error("nt网络类型为空");
        }else if(!"1".equals(nt) && !"0".equals(nt)&& !"2".equals(nt)&& !"3".equals(nt)&& !"4".equals(nt)){
            log.error("nt网络类型取值非0，1，2，3，4而是为"+nt);
        }
    }
}
