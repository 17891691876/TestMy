package bigtest.validate.request.rm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j

public class RmReasonValueValidate {
    public static void rmreasonvalidate(String reason){
        log.info("我来啦");
        if(StringUtils.isEmpty(reason)){
            log.error("reason替换为空");


        }
    }
}
