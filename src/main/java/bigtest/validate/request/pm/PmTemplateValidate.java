package bigtest.validate.request.pm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PmTemplateValidate {
    public static void pmtemplatevalidate_case1(String template){
        if(StringUtils.isEmpty("template")){
            log.error("template为空");}
        else if (!"true".equals(template)&&!"false".equals(template)){
             log.info("template为"+template);
            }
        }

    public static void pmtemplatevalidate_case2(String template){
        if ("true".equals(template)){
            log.error("template替换错误");
        }
    }

    }

