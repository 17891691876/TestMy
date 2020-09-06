package bigtest.validate.request.xm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class XmIsCloseValidate {
    public static void xmisclosevalidate(String is_close){
        if(!"1".equals(is_close) && "0".equals(is_close)){
            log.error("is_close为"+is_close);}
        else if (StringUtils.isEmpty(is_close)){
            log.error("is_close为空");
            }
        }
    }

