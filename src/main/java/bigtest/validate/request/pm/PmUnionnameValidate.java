package bigtest.validate.request.pm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PmUnionnameValidate {
    public static void pmunionnamevalidate(String union_name){
        if (StringUtils.isEmpty(union_name)){
            log.error("union_name为空");
        }
    }
}
