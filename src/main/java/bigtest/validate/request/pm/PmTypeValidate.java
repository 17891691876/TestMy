package bigtest.validate.request.pm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;

import java.util.ArrayList;

@Slf4j
public class PmTypeValidate {
    public static void pmtypevalidate(String type){
        ArrayList strArray=new ArrayList<>();
//         strArray=["第三方广告平台","正常售卖","半量售卖","配送","赔偿","内部使用","商务置换"];
        if (StringUtils.isEmpty(type )){
            log.error("type为空");
        }
    }
}
