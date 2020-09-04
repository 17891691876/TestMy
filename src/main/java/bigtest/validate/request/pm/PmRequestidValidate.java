package bigtest.validate.request.pm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PmRequestidValidate {
    public  static void pmrequestvalidate_case1(String request_id){
        if (StringUtils.isEmpty(request_id)){
            log.error("request_id为空");
        }
    }

    public static void pmrequestvalidate_case2(String request_id){
        if ("1".equals(request_id)){
            log.error("request_id替换错误");
        }
    }
}
