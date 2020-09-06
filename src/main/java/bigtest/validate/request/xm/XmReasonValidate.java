package bigtest.validate.request.xm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class XmReasonValidate {
    public static void xmreasonvalidate(String reason){
        if (StringUtils.isEmpty(reason)){
            log.error("reason为空");
        }
    }
}
