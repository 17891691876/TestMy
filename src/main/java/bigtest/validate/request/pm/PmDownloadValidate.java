package bigtest.validate.request.pm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class PmDownloadValidate {
    public static void pmdownloadvalidate(String download){
        if (StringUtils.isEmpty(download)){
            log.error("download为空");}
        else if (!"1".equals(download) &&!"0".equals(download))
         {
            log.error("download替换错误");
            }

    }
}
