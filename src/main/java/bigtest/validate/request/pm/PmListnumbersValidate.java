package bigtest.validate.request.pm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PmListnumbersValidate {
    public static  void pmlistnumbersvalidate(String list_numbers){
        if (StringUtils.isEmpty(list_numbers)){
            log.error("list_numbers为空");
        }
    }
}
