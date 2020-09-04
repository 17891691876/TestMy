package bigtest.validate.request.getother;

import com.hupu.ad.foundation.constants.HupuAdType;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;



@Slf4j
public class HupuAdTypeValidate {

    public static void validate(String hupu_ad_type) {
        if (StringUtils.isEmpty(hupu_ad_type)){
            log.error("hupu_ad_type参数为空");
        }else{
            HupuAdType splitAdType = new HupuAdType(hupu_ad_type);
            Integer index = splitAdType.getIndex();
            String targetId = splitAdType.getTargetId();
        }
    }

}

