package bigtest.validate.request.getother;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;



@Slf4j
public class VersionValidate {
    public static void validate(String version){
        if (StringUtils.isEmpty(version)){
            log.error("version");
        }else {
            log.info("version取值是为"+version);
        }
    }
}

