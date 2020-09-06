package bigtest.validate.request.cm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class CmClickurlValidate {
    public static void cmclickurlvaladate(String click_url){
        if(StringUtils.isEmpty(click_url)){
            log.error("click_url为空");
        }
    }
}
