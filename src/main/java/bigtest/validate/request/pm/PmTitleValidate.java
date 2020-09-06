package bigtest.validate.request.pm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PmTitleValidate {
    public static void pmtitlevalidate(String title){
        if (StringUtils.isEmpty(title)){
            log.error("title为空");
        }
    }
}
