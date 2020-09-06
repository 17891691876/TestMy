package bigtest.validate.request.getother;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
@Slf4j
public class OsValidate {
    public static void validate(String os){
        if(StringUtils.isEmpty(os)){
            log.error("os操作系统为空");
        }else if (!"1".equals(os) && !"2".equals(os)){
            log.error("os操作系统非安卓和ios而是为"+os);
        }
    }
}
