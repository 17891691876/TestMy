package bigtest.validate.request.pm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PmFirstNaviValidate {
    public static void pmfirstnavivalidate(String first_navi){
        if (StringUtils.isEmpty(first_navi)){
            log.error("first_navi为空");
        }
    }
}
