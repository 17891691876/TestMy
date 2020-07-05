package bigtest.validate.request;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class FidValidate {
    public static void validate(String fid){
        if (StringUtils.isEmpty(fid)){
            log.error("fid社区板块id为空");
        }
    }
}
