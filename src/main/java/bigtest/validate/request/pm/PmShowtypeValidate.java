package bigtest.validate.request.pm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class PmShowtypeValidate {
    public static void pmshowtypevalidate(String show_type,String style){
        boolean flag = true;
        if (StringUtils.isEmpty(show_type)){
            log.error("show_type为空");
            flag=false;
        }
        if (flag==false){
            if (StringUtils.isEmpty(style)){
                log.error("style与show_type都为空");
            }
        }
    }

}
