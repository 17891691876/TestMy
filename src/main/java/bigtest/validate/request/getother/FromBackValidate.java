package bigtest.validate.request.getother;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class FromBackValidate {
    public static void validate(String fromback){
        if(StringUtils.isEmpty(fromback)){
            log.error("fromback是否从后台返回为空");
        }else if(!"1".equals(fromback) && !"0".equals(fromback)){
            log.error("fromback是否从后台返回取值非1和0而是为"+fromback);
        }
    }
}
